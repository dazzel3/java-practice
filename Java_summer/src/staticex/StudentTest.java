package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("ÀÌ³ª¶ó");
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("±è»ç¶û");
		System.out.println(Student.getSerialNum());
	}

}
