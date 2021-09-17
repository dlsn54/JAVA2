
public class Car {
	String color;
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	int speed;
	int gear;
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	void speedUp() {
		speed+=10;
	}

	void speedDown() {
		speed-=10;
	}
	
	

}
