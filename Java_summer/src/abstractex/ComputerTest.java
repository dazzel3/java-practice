package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new DeskTop();
		
		desktop.typing();
		desktop.turnOff();
		
		Computer notebook = new MyNoteBook();
		
		notebook.display();
		notebook.turnOff();
	}

}
