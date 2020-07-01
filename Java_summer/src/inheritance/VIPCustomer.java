package inheritance;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	
//	  public VIPCustomer() {
//	  
//		  //super(); 상위클래스 생성자 먼저 호출됨 
//		  // 만약 상위클래스의 기본생성자가 없는 경우 (= 매개변수가 있는 생성자만 존재하는경우), 하위클래스는 명시적으로 상위 클래스의 생성자를 호출해야함
//		  customerGrade = "VIP"; 
//		  bonusRatio = 0.05; 
//		  salesRatio = 0.1; 
//	  }
	  
		
		public VIPCustomer(int customerID, String customerName) {
			super(customerID, customerName);
			
			customerGrade = "VIP";
			bonusRatio = 0.05;
			salesRatio = 0.1;
			
			System.out.println("VIPCustomer(int, String) 생성자 호출");
		}
	 
	
	
	
	
}
