package section9;

class vehicle1 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
public String run() {
	if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed >0) {
		return "running";
	}else
		return "not running";
}
}

public class methodfunction {
	public static void main(String[] args) {
		vehicle1 car = new vehicle1();
		car.setDoors("closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());

	}
}
