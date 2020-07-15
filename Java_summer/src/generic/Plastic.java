package generic;

public class Plastic extends Material {
	
	public String toString() {
		return "재료는 plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("plastic으로 프린팅 합니다.");
	}
}
