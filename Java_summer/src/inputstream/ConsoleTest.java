package inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("비밀번호:");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
		
		// 이 내용은 이클립스에서 지원하지 않기 때문에 직접 cmd창에서 돌릴 수 있음
	}

}
