package miniproject3;

public class VIPSalesRatio implements SalesRatio {

	//To-do VIP 회원의 경우 5만원 이하는 0%, 
	//5만원에서 10만원 이하는 10%, 10만원에서 20만원 이하는 20%, 
	//20만원 이상은 30%를 할인해 줍니다. 
	
	@Override
	public double getSalesRatio(int price) {
		if (price > 0 && price <= 50000) {
			return 0.0;
		}
		else if (price > 50000 && price <= 100000) {
			return 0.1;
		}
		else if (price > 100000 && price <= 200000) {
			return 0.2;
		}
		else {
			return 0.3;
		}
	}
}
