package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
																	// true 쓰면 run할때 마다 write 이어서 됨
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
