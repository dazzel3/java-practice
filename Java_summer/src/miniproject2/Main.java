package miniproject2;

import miniproject2.BulgogiBurger;
import miniproject2.CheeseBurger;
import miniproject2.ChickenBurger;
import miniproject2.OriginalBurger;
import miniproject2.HamburgerOrderMachine;

public class Main {
	public static void main(String[] args) {
		
		//과제 상세
		HamburgerOrderMachine hamburgerOrderMachine1 = new HamburgerOrderMachine();
		hamburgerOrderMachine1.order(new BulgogiBurger());
		hamburgerOrderMachine1.order(new CheeseBurger());
		int totalPrice1 = hamburgerOrderMachine1.completeOrder();
		System.out.println("첫번째 주문은 " + totalPrice1 + "원 입니다.");

		//과제 상세
		HamburgerOrderMachine hamburgerOrderMachine2 = new HamburgerOrderMachine();
		hamburgerOrderMachine2.order(new OriginalBurger());
		hamburgerOrderMachine2.order(new ChickenBurger());
		hamburgerOrderMachine2.order(new ChickenBurger());
		
		int totalPrice2 = hamburgerOrderMachine2.completeOrder();
		//총 합계 가격
		
		System.out.println("두번째 주문은 " + totalPrice2 + "원 입니다.");
		
		
		
	}
}
