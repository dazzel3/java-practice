package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
	
		CompleteCalc calc1 = new CompleteCalc();
		Calc calc2 = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc1.add(n1, n2));
		System.out.println(calc1.substract(n1, n2));
		System.out.println(calc1.times(n1, n2));
		System.out.println(calc1.divide(n1, n2));
		
		calc1.showInfo();
		
		System.out.println(calc2.add(n1, n2));
		System.out.println(calc2.substract(n1, n2));
		System.out.println(calc2.times(n1, n2));
		System.out.println(calc2.divide(n1, n2));
				
		//calc2.showInfo(); 할 수 없음 왜냐면 calc2는 Calc형으로 선언되었기 때문에 Calc안에 있는 메서드만 사용가능
		
		calc1.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
