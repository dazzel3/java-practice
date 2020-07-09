package interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("소설1");
		bookQueue.enQueue("소설2");
		bookQueue.enQueue("소설3");
		
		System.out.println(bookQueue.getSize());
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
		System.out.println(bookQueue.getSize());
	}

}
