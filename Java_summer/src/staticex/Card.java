package staticex;

public class Card {
	
	private static int SERIALNUM = 10000;
	
	public int getCardNumber() {
		++SERIALNUM;
		return SERIALNUM;
	}
}
