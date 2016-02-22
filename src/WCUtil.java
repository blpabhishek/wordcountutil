import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


class WCUtil {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		File file = new File(args[0]);
		int length = (int)file.length();
		FileReader fr =new FileReader(file);
		char[] cbuf = new char [length];
		fr.read(cbuf,0,length);
		WordCount wc = new WordCount(new String(cbuf));
        String result = wc.getDefault(file.toString());
        System.out.println(result);
	}
}