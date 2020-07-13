package miniproject2;

import java.util.ArrayList;
import java.util.List;

import miniproject2.Hamburger;

public class HamburgerOrderMachine {
	private ArrayList<Hamburger> hamburgerList;

	public HamburgerOrderMachine() {
		// TODO 여기서 hamburgerList 를 초기화 합니다.
		hamburgerList = new ArrayList<Hamburger> ();
	}

	public void order(Hamburger hamburger) {
		// TODO 주문 받은 햄버거를 hamburgerList에 저장합니다.
		hamburgerList.add(hamburger);
	}

	public int completeOrder() {
		int totalPrice = 0;

		// TODO 여기서 hamburgerList를 순회하며
			//  1)각 햄버거들의 재료를 출력하고
			//  2)동시에 각 가격을 조회하여 합산한 총 가격을 구한 후 return 합니다.
		for (Hamburger burger : hamburgerList) {
			System.out.println(burger.getIngredient()+" "+burger.getPrice()+"원");
			totalPrice += burger.getPrice();
		}
		
		return totalPrice;
	}

}
