package cooperation;

public class Student {
	
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus (Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	public void takeSubway (Subway subway) {
		subway.take(1250);
		this.money -= 1250;
	}
	
	public void takeTaxi (Taxi taxi) {
		taxi.take(3600);
		this.money -= 3600;
		
	}
	
	public void showStudentInfo() {
		System.out.println(name+"´ÔÀÇ ³²Àº µ·Àº "+money+"¿ø ÀÔ´Ï´Ù.");
	}
}
