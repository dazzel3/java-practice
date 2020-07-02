package inheritance_polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이지은");
		Customer customerShin = new Customer(10020, "신나라");
		Customer customerHong = new GOLDCustomer(10030, "홍길동");
		Customer customerCho = new GOLDCustomer(10040, "조은영");
		Customer customerKim = new VIPCustomer(10050, "김사랑", 1234);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerCho);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		
		for (Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인과 보너스 포인트 적립 ======");
		
		int price = 10000;
		
		for (Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
		} 
		
		
	}

}
