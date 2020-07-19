package lambda;

@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	//함수형 인터페이스는 메서드 하나만 써야함
}
