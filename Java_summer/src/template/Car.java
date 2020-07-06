package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	
//	템플릿메서드- 설계 전체의 흐름을 정의해 놓은 메서드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
