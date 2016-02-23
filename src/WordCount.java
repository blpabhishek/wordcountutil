public class WordCount {
	private String text;
	public WordCount(String text){
		this.text = text;
	}
	public int charCount(){
		return text.length();
	} 
	public int byteCount(){
		byte[] bytes = text.getBytes();
		return bytes.length;
	}
	public int wordCount(){
		return text.split("\\s").length;
	}
	public int lineCount(){		
		return text.split("\n").length;
	}
	private String getResult(String fileName){
		return "\t\b"+lineCount()+"\t\b"+wordCount()+"\t\b"+byteCount()+" "+fileName;
	}
	public String getResult(String fileName,String options){
		if(options.equals("")) return getResult(fileName);
		return arrange(options)+" "+fileName;
	}
	private String arrange(String options){
	String result =new String("\t\b");
	if(options.indexOf("l")>=0) result+=lineCount()+"\t\b";
	if(options.indexOf("w")>=0) result+=wordCount()+"\t\b";
	if(options.lastIndexOf("m") > options.lastIndexOf("c")) result+=charCount();
	if(options.lastIndexOf("m") < options.lastIndexOf("c")) result+=byteCount();
	return result;
	}
}

