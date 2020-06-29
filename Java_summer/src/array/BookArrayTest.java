package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("리더십의 실제1","손주영");
		library[1] = new Book("리더십의 실제2","손주영");
		library[2] = new Book("리더십의 실제3","손주영");
		library[3] = new Book("리더십의 실제4","손주영");
		library[4] = new Book("리더십의 실제5","손주영");
		
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
