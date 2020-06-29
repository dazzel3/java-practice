package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("리더십의 실제1","손주영");
		library[1] = new Book("리더십의 실제2","손주영");
		library[2] = new Book("리더십의 실제3","손주영");
		library[3] = new Book("리더십의 실제4","손주영");
		library[4] = new Book("리더십의 실제5","손주영");
		
		
		
		//얕은 복사: 주소만 복사됨 그래서 원본만 배열값 바꿔도 카피본도 같이 바껴있음 왜냐면 같은 주소를 가리키니까
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
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
