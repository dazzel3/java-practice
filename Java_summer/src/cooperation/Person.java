package cooperation;

public class Person {
	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarAmericano(StarCoffee coffee, int money) {
		String message = coffee.buy(Menu.STARAMERICANO);

		if (message != null) {
			this.money -= money;
			System.out.println(name+"님이 "+money+"원으로 "+message);
		}
	}
	
	public void buyStarLatte(StarCoffee coffee, int money) {
		String message = coffee.buy(Menu.STARLATTE);

		if (message != null) {
			this.money -= money;
			System.out.println(name+"님이 "+money+"원으로 "+message);
		}	
	}
	
	public void buyBeanAmericano(BeanCoffee coffee, int money) {
		String message = coffee.buy(Menu.BEANAMERICANO);

		if (message != null) {
			this.money -= money;
			System.out.println(name+"님이 "+money+"원으로 "+message);
		}
	}
	
	public void buyBeanLatte(BeanCoffee coffee, int money) {
		String message = coffee.buy(Menu.BEANLATTE);

		if (message != null) {
			this.money -= money;
			System.out.println(name+"님이 "+money+"원으로 "+message);
		}	
	}
}
