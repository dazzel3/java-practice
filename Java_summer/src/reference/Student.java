package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		System.out.println(studentName+" 학생의 국어 점수는 "+korean.score+"점 입니다.");
		System.out.println(studentName+" 학생의 수학 점수는 "+math.score+"점 입니다.");
	}
}
