package day14;

public class Tri {
	// �� Ŭ������ ����� ���� ���� ����
	private int width, height;
	private double area;
	
	// �⺻ ������ �Լ�
	public Tri() {}
	
	// ������ �Լ� �����ε�
	public Tri(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	// ���� ���ؼ� �Է��ϴ� �Լ�
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public double getArea() {
		return area;
	}
	
	// �� Ŭ������ ������ ���ڿ��� ��ȯ���ִ� toString() �������̵�
	public String toString() {
		return "\t\t�غ� : " + width + "\n\t\t���� : " + height + "\n\t\t���� : " + area + "\n�� �ﰢ��\n";
	}
	
	// �� Ŭ������ �غ��� ������ ���� ��ü�� �Ǵ����ִ� ����� equals �Լ� �������̵�
	public boolean equals(Object obj) {
		return this.width == ((Tri) obj).width;
	}
}