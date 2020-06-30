package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"Lee");
		
		lee.addBook("태백산맥1");
		lee.addBook("태백산맥2");
		
		Student kim = new Student(1001,"Kim");
		
		kim.addBook("토지1");
		kim.addBook("토지2");
		kim.addBook("토지3");
		
		Student cho = new Student(1001,"Cho");
		
		cho.addBook("해리포터1");
		cho.addBook("해리포터2");
		cho.addBook("해리포터3");
		cho.addBook("해리포터4");
		cho.addBook("해리포터5");
		cho.addBook("해리포터6");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
	}

}
