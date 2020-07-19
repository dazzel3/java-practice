package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				//num += 10; 변경 불가 - 한번 호출되면 더는 못쓰는데 run함수는 계속 유효해서 언제든지 불릴 수 있기 때문에
				//i = 200; 변경 불가 - "
				
				System.out.println(i);
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
