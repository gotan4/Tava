package day12;

public class Lotze extends Car {
	int speed = 60;
	public void speedUp() {
		speed += 40;
		//오버라이딩
	}
	public void speedUp(int s) {
		speed += s;
		//오버로딩
	}

}
