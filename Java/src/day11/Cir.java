package day11;

public class Cir extends Dohyung{

	int rad;
	double arround;
	
	public Cir() {
		this(1);
	}
	public Cir(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = 2 * rad * 3.14;
		
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	//����Լ�  - Dohyung 
	public void toPrint() {
		System.out.printf("���� ������ : %3d\n���� �ѷ� : %5.2f\n���ǳ��� : 5.2f\n", rad, arround, area);
		
	}
}
