package car;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}
}
