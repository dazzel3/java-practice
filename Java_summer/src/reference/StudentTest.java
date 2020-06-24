package reference;

public class StudentTest {

	public static void main(String[] args) {

		
		Student studentLee = new Student(101, "Lee");
		studentLee.setKoreanSubject("국어", 90);
		studentLee.setMathSubject("수학", 100);
		
		
		Student studentKim = new Student(102,"Kim");
		studentKim.setKoreanSubject("국어", 70);
		studentKim.setMathSubject("수학", 80);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}
}
