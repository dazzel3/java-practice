package lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//람다식이 변수에 대입되어 사용되는 경우
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello");
		
		//람다식이 매개변수로 사용되는 경우
		showMyString(lambdaStr);
		
		
		//람다식이 메서드의 반환값으로 사용되는 경우
		PrintString test = returnString();
		test.showString("hello3");
	}
	
	//람다식이 매개변수로 사용되는 경우
	public static void showMyString(PrintString p) {
		p.showString("hello2");
	}
	
	//람다식이 메서드의 반환값으로 사용되는 경우
	public static PrintString returnString() {
		return s -> System.out.println(s+"!!!");
	}

}
