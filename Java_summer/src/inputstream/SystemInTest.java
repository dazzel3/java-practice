package inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("ют╥б:");
		
		try {
			int i;
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
