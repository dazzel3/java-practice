package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("리더십의 실제1","손주영");
		library[1] = new Book("리더십의 실제2","손주영");
		library[2] = new Book("리더십의 실제3","손주영");
		library[3] = new Book("리더십의 실제4","손주영");
		library[4] = new Book("리더십의 실제5","손주영");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		//깊은 복사: 주소가 복사되는게 아니라 아예 각각 객체가 선언되고 그 객체 배열값에 들어가기 때문에 원본 변경하면 원본만 변경됨
		for (int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("컴퓨터과학");
		library[0].setAuthor("최윤철");
		
		for (Book book: library) {
			book.showBookInfo();
		}
		
		System.out.println("==================");
		
		for (Book book: copyLibrary) {
			book.showBookInfo();
		}
		
		
		
	}

}
