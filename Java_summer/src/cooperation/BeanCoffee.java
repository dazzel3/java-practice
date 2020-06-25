package cooperation;

public class BeanCoffee {
	
	int money;
	
	public String buy(int money) {
		this.money = money;
		
		if (money == Menu.BEANAMERICANO) {
			return "콩카페 아메리카노를 구입했습니다.";
		}
		else if (money == Menu.BEANLATTE) {
			return "콩카페 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
