package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이지은");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김사랑");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//업캐스팅: 상위클래스로의 묵시적 형변환 (역은 성립하지 않음)
		// VIPCustomer() 생성자를 호출했기 때문에 인스턴스는 모두 생성됨
		// customerCho는 타입이 Customer이기 때문에 접근가능한 변수나 메서드는 Customer의 변수와 메서드만 가능
		Customer customerCho = new VIPCustomer(10030, "조은영");
	}

}
