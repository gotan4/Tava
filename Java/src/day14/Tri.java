package day14;
/*
 ����2]
	�ﰢ�� Ŭ������ �ۼ��ϰ�
	
	�ﰢ�� Ŭ������ �غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ� 
	���� �غ��� ������ ���� �ﰢ���� �ǵ���
	equals �Լ��� �������̵� �ϰ�
	�׽�Ʈ �ϼ���.	
	
	�Է��� JOptionPane �Ҽ��� �Լ��� ó���ϰ�
	��µ� ���� �Ҽ��� �Լ��� ó���ϼ���.
	�߰��� ����ó���� ���ּ���.
		
 */
public class Tri {
	private int mit;
	private int nop;
	private double area;
	

	public Tri(int mit, int nop) {
		this.mit = mit;
		setArea();
		
	}
	
	public void setArea() {
		area = mit * nop * 0.5;
	}
	public double getArea() {
		return this.area;
		
	}
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Tri t = (Tri) obj;
		
		bool = (this.area == t.area) ? true : false;
		// ��� ��ȯ���ְ�....
		return bool;
		
	}
	public toString() {
		
	}
	
		
}
