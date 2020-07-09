package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999;
	
	public int add (int num1, int num2);
	public int substract (int num1, int num2);
	public int times (int num1, int num2);
	public int divide (int num1, int num2);
	
	default public void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total (int[] arr) {
		int total = 0;
		
		for (int i: arr) {
			total += i;
		}
		myStaticMethod();
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static method");
	}
}
