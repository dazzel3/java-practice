package staticex;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card mycard = company.createCard();
		Card yourcard = company.createCard();
		
		System.out.println(mycard.getCardNumber());
		System.out.println(yourcard.getCardNumber());
	}

}
