package day14;

public class Dongle {
	private int rad;
	private double arround, area;
		
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}
	
	public void setArea() {
		area = 3.14 * rad *rad;
		
	}
	// area �� ���������ڰ� private �̰� �̰��� Ŭ�����׿����� 
	// ������ ���� �ϹǷ� �Լ��� ���� �����͸� ��ȯ���ֵ��� ����.
	
	public double getArea() {
		return this.area;
	}
	// ���� ������ ������ ���� ������ �Ǵܵǵ��� equals �Լ��� �������̵� �غ���
	public boolean equals(Object obj) {
		boolean bool = false;
		// �ԷµǴ� Dongl �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����� �� ���̹Ƿ�
		// Dongl Ÿ������ ���� ����ȯ�� ���Ѽ� ����� ����ؾ� �ڴ�.
		Dongle d1 = (Dongle) obj;
		
		// Ÿ���� ��ȯ�� ��� ���� ������ ������ ���غ���
		// �񱳴� ����� �ΰ��� �ʿ��ϴ�. �ϳ��� �Ű������� �Է��� �޾Ҵ�. �׷� �ϳ���??
		bool = (this.area == d1.area) ? true : false;
		// ��� ��ȯ���ְ�....
		return bool;
		
		
	}
}