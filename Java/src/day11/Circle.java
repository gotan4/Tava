package day11;

/*
	���� 1]
		�� Ŭ������ ���� ������ ������ Ŭ�����̴�.
		�� Ŭ���� ��ü�� �� �� 
		�������� �Է¹޾Ƽ� ���� ���� ������ �Է��� �ǰ� 
		Ŭ������ ���� �ϼ���.
		
		�������� �Է��� �� �� ���� 10���� �Էµǰ� �ϼ���.
 */
public class Circle {
	// �� Ŭ������ ���� ���� ������ ����ϴ� Ŭ�����̹Ƿ�
	// ������, �ѷ�, ���̸� ����ϸ� �ɰ��̴�.
	int rad;
	double arround, area;
	
	// �⺻ ������ �Լ�
	public Circle() {
		this(10);
	}
	
	// �������Լ� �����ε�
	public Circle(int rad) {
		this.rad = rad;
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// ���� �ѷ� �����ִ� �Լ�
	public double getArround(int rad) {
		return 2 * rad * 3.14;
	}
	
	// ���� ���� �����ִ� �Լ�
	public double getArea(int rad) {
		return rad * rad * 3.14;
	}
	
	// ����ϴ� ����� �Լ�
	public void toPrint() {
		System.out.printf("������ : %5d | ���ǵѷ� : %7.2f | ���� ���� | % 7.2f\n", rad, arround, area);
	}
}
