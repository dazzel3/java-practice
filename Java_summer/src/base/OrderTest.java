package base;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNumber = 201907210001L;
		order.personID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.personName = "홍길순";
		order.orderProductNumber = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		order.showInfo();
		
		
	}

}
