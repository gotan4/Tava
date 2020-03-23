package day10;
public class Std {
	// �� Ŭ������ �л� �Ѹ��� �������̹Ƿ�
	// �л����̸��� �־�� �ڴ�.
	String name;
	// ���� ������ ������ �������� ������ ��������.
	int kor, eng, math, phys, cod;
	
	// �� Ŭ������ �ν��Ͻ��� �Ǵ� ����
	// �ش� �ν��Ͻ��� �����ָ� ������ ������ ������ ����.
	// ����� �ʱ�ȭ ������ �ϴ� �Լ��� ������ �Լ��̹Ƿ�
	// ������ �Լ����� �ԷµǴ� �̸����� �ʱ�ȭ ��Ű��� ����.
	
	public Std() {}
	
	public Std(String name) {
		this.name = name;
		setSubj();
	}
	
	// ���� ���� �Է����ִ� �Լ�
	// �츮�� �����ϰ� �Է��� �ǰ� ����.
	public void setSubj() {
		kor = (int)(Math.random()*41 + 60);
		eng = (int)(Math.random()*41 + 60);
		math = (int)(Math.random()*41 + 60);
		phys = (int)(Math.random()*41 + 60);
		cod = (int)(Math.random()*41 + 60);
	}
	
	// ���� �����ִ� �Լ�. �츮�� ������ ���� ������ ����.
	// ���� �� �Լ��� ����Ǹ� ������ �˷��ֵ��� �ؾ߰ڴ�.
	public int getSum() {
		// ��������� ��ȯ
		return kor + eng + math + phys + cod;
	}
	
	// ��� �����ִ� �Լ�
	public double getAvg() {
		return getSum() / 5.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n", name, kor, eng, math, phys, cod, getSum(), getAvg());
	}
}
