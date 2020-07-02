package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이지은");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김사랑");
		customerKim.bonusPoint = 10000;
		
		GOLDCustomer customerCho = new GOLDCustomer(10030, "조은영");
		customerCho.bonusPoint = 10000;
		
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceCho = customerCho.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo()+" 지불할 금액은 "+priceLee+"원 입니다.");
		System.out.println(customerKim.showCustomerInfo()+" 지불할 금액은 "+priceKim+"원 입니다.");
		System.out.println(customerCho.showCustomerInfo()+" 지불할 금액은 "+priceCho+"원 입니다.");
	}

}
