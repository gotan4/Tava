package day12;

public class Lotze extends Car {
	int speed = 60;
	public void speedUp() {
		speed += 40;
		//�������̵�
	}
	public void speedUp(int s) {
		speed += s;
		//�����ε�
	}

}
