package cooperation;

public class PersonTest {

	public static void main(String[] args) {

		Person kim = new Person("±è³ª¶ó", 10000);
		Person lee = new Person("ÀÌ»ç¶û", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarAmericano(starCoffee, Menu.STARAMERICANO);
		lee.buyBeanLatte(beanCoffee, Menu.BEANLATTE);
	}

}
