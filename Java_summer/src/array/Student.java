package array;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	int studentID;
	
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for (Subject s: subjectList) {
			total += s.getScore();
			
			System.out.println(studentName+"학생의 "+s.getName()+"과목의 성적은 "+s.getScore()+"점 입니다.");
		}
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.");
	}
}
