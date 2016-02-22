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
	public String getDefault(String fileName){
		return "\t\b"+lineCount()+"\t\b"+wordCount()+"\t\b"+byteCount()+" "+fileName;
	}
}