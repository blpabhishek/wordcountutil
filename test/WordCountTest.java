import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WordCountTest {
	@Test
	public void charCount_counts_the_number_of_character(){
		String text ="I am a Text";
		WordCount wc = new WordCount(text);
		assertEquals(11,wc.charCount());
	}
	@Test
	public void byteCount_counts_the_number_of_bytes(){
		String text ="∑∑´®†¥åΩ≈ç√∫˜µ";
		WordCount wc = new WordCount(text);
		assertEquals(34,wc.byteCount());
	}
	@Test
	public void wordCount_counts_the_number_of_words(){
		String text ="This is a Sample Text";
		WordCount wc = new WordCount(text);
		assertEquals(5,wc.wordCount());
	}
	@Test
	public void lineCount_counts_the_number_of_lines(){
		String text ="This is a Sample Line\n This is second Line";
		WordCount wc = new WordCount(text);
		assertEquals(2,wc.lineCount());
	}
	@Test
	public void getDefault_gives_the_sample_output_for_a_file(){
		String text ="This is a Sample Line\n This is second Line";
		String fileName ="sample.txt";
		WordCount wc = new WordCount(text);
		assertEquals("\t\b2\t\b10\t\b42 sample.txt",wc.getDefault(fileName));
	}
}