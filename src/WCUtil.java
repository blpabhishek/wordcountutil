import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WCUtil {
	public static void readFile(String fileName,String options) throws FileNotFoundException,IOException{
		File file = new File(fileName);
		int length = (int)file.length();
		FileReader fr =new FileReader(file);
		char[] cbuf = new char [length];
		fr.read(cbuf,0,length);
		WordCount wc = new WordCount(new String(cbuf));
        String result = wc.getResult(file.toString(),options);
        System.out.println(result);
	}
	public static void main(String[] args){
		ArgsParser parser = new  ArgsParser(args);
		String[] files = parser.getFiles();
		String options = parser.getOptions();
		for (String file : files) {
			try{
				readFile(file,options);
			}catch(FileNotFoundException fne){
				System.err.println("wc :"+fne.getMessage());
			}
			catch(IOException ioe){
				System.err.println("wc :"+ioe.getMessage());
			}
		}
	}
}