package base;

public class Order {

	public long orderNumber;
	public String personID;
	public String orderDate;
	public String personName;
	public String orderProductNumber;
	public String orderAddress;
	
	public void showInfo() {
		System.out.println("주문 번호: "+orderNumber);
		System.out.println("주문자 아이디: "+personID);
		System.out.println("주문 날짜: "+orderDate);
		System.out.println("주문자 이름: "+personName);
		System.out.println("주문 상품 번호: "+orderProductNumber);
		System.out.println("배송 주소: "+orderAddress);
	}
}
