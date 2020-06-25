package cooperation;

public class StarCoffee {
	
	int money;
	
	public String buy(int money) {
		this.money += money;
		
		if (money == Menu.STARAMERICANO) {
			return "별카페 아메리카노를 구입했습니다.";
		}
		else if (money == Menu.STARLATTE) {
			return "별카페 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
