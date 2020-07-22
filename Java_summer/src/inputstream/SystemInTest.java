package inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("입력 후 '끝'이라고 쓰세요:");
		
		try {
			int i;
			//보조스트림 - 바이트로 읽은거를 문자로 바꿔줌
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
