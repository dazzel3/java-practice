package classex;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			return ((this.day == date.day) &&(this.month == date.month) && (this.year == date.year));
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return day+month+year;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
