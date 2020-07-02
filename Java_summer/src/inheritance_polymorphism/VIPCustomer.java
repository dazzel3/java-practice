package inheritance_polymorphism;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	int agentID;
	
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint = (int)(price*bonusRatio);
		return price - (int)(price*salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";
	}
	
	
}
