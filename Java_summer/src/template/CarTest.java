package template;

import abstractex.Computer;
import abstractex.DeskTop;
import abstractex.MyNoteBook;

public class CarTest {

public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("=====================");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
	}

}
