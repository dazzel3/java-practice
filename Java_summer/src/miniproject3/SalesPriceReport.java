package miniproject3;


import java.util.List;

public class SalesPriceReport {
	
	List<Member> list;
	
	double ratio = 0.0;
	SalesRatio salesStrategy[] = {new BasicSalesRatio(), new VIPSalesRatio()};
	// FAMILY 등급과 VIP 등급의 세일즈 전략을 2가지로 결정합니다.
	
	public SalesPriceReport(List<Member> list) {
		this.list = list;
	}
	
	public void generateSaleReport(int price) {
		
		// To-do 모든 FAMILY 등급의 회원과, VIP 등급의 회원의 세일즈 보고서를 만듭니다.
		
		
		int salePrice = 0;
		
		
		for (Member member : list) {
			// FAMILY 등급
			if (member.getGrade() == "FAMILY") {
				ratio = salesStrategy[0].getSalesRatio(price);
				salePrice = price - (int)(price*ratio);
				System.out.print(member.getMemberName()+"님 ");
				System.out.println(member.getGrade()+"등급과 가격에 따른 세일 비율은 " + ratio + "이며, 가격은 " + salePrice + "입니다."); 
			
			//VIP 등급	
			} else if (member.getGrade() == "VIP"){
				ratio = salesStrategy[1].getSalesRatio(price);
				salePrice = price - (int)(price*ratio);
				System.out.print(member.getMemberName()+"님 ");
				System.out.println(member.getGrade()+"등급과 가격에 따른 세일 비율은 " + ratio + "이며, 가격은 " + salePrice + "입니다.");
			}
			else {
				System.out.println("error");
			}
		}
	
		
		System.out.println("==========================================================");
		System.out.println();
	
	}
}
