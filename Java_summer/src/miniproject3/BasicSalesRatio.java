package miniproject3;

public class BasicSalesRatio implements SalesRatio {
	
	// To-do  일반 회원인 경우 5만원 이하는 0%, 
	//5만원에서 10만원 이하는 5%, 
	//10만원에서 20만원 이하는 10% 20만워 초과는 20% 할인해줍니다.
	
	@Override
	public double getSalesRatio(int price) {
		if (price > 0 && price <= 50000) {
			return 0.0;
		}
		else if (price > 50000 && price <= 100000) {
			return 0.05;
		}
		else if (price > 100000 && price <= 200000) {
			return 0.1;
		}
		else {
			return 0.2;
		}
	}
	
	
	
}
