package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		while ((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}

}
