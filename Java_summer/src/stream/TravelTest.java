package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("이순신",40,100);
		TravelCustomer customerKim = new TravelCustomer("김유신",20,100);
		TravelCustomer customerHong = new TravelCustomer("홍길동",13,50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total+"만원");
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		//sorted() -> 가나다 순서대로 정렬해줌
		
	}

}
