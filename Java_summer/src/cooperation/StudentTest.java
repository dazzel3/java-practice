package cooperation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("Jenny",11200);
		Student studentK = new Student("Kelly",11250);
		Student studentN = new Student("Nick",13600);
		
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		Taxi taxi1234 = new Taxi(1234);
		Taxi taxi5678 = new Taxi(5678);
		
		studentJ.takeBus(bus101);
		studentK.takeSubway(subwayGreen);
		studentN.takeTaxi(taxi1234);
		
		studentJ.showStudentInfo();
		studentK.showStudentInfo();
		studentN.showStudentInfo();
		
		bus101.showBusInfo();
		bus102.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		taxi1234.showTaxiInfo();
		taxi5678.showTaxiInfo();
	}

}
