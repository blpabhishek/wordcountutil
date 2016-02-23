import org.junit.Assert;
import org.junit.Test;

public class ArgsParserTest {
	@Test
	public void getFiles_returns_all_the_files(){
		String [] args ={"-w","file"};
		ArgsParser p = new ArgsParser(args);
		String[] expected = {"file"};
		Assert.assertArrayEquals(expected,p.getFiles());
	}
	@Test
	public void getOptions_returns_all_the_options(){
		String [] args ={"-w","file"};
		ArgsParser p = new ArgsParser(args);
		String expected = new String("w");
		Assert.assertEquals(expected,p.getOptions());
	}
	@Test
	public void getOptions_returns_all_the_optins(){
		String [] args ={"-wlc","file"};
		ArgsParser p = new ArgsParser(args);
		String expected = new String("wlc");
		Assert.assertEquals(expected,p.getOptions());
	}
	@Test
	public void getOptions_returns_all_the_ptins(){
		String [] args ={"-cl","-w","file"};
		ArgsParser p = new ArgsParser(args);
		String expected = new String("clw");
		Assert.assertEquals(expected,p.getOptions());
	}
}