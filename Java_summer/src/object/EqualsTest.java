package object;

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentID == std.studentID);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student lee = new Student(100,"이상민");
		Student lee2 = lee;
		Student sang = new Student(100,"이지은");
		
		System.out.println(lee == sang);
		System.out.println(lee.equals(sang));
		
		System.out.println(lee.hashCode());
		System.out.println(lee2.hashCode());
		System.out.println(sang.hashCode());
		
		System.out.println(System.identityHashCode(lee));
		System.out.println(System.identityHashCode(lee2));
		System.out.println(System.identityHashCode(sang));
	}

}
