package day10;

/*
 ���� 3]
	
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �����ϰ�
	����, ����� ����ؼ� �Է��� Ŭ������ �����ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ���� ó���ϼ���
	�׸��� 5���� �л��� �迭�� ���� ���� ����, �̸��� �Է��ؼ�
	����ϼ���.
	 
 */
public class Sub5 {
	// ��� ���� ����
	String name;
	int kor, eng, math, phys, cod;

	public Sub5() {
	}

	public Sub5(String name) {
		this.name = name;
		this.kor = (int) (Math.random() * 41 + 60);
		this.eng = (int) (Math.random() * 41 + 60);
		this.math = (int) (Math.random() * 41 + 60);
		this.phys = (int) (Math.random() * 41 + 60);
		this.cod = (int) (Math.random() * 41 + 60);

	}

	public int getSum() {
		return kor + eng + math + phys + cod;
	}

	// ��� �����ִ� �Լ�
	public double getAvg() {
		return getSum() / 5.;
	}

	public void toPrint() {
		System.out.printf("%5s : %5s\n", "�� ��", name);
		System.out.printf("%5s : %5d\n", "�� ��", kor);
		System.out.printf("%5s : %5d\n", "�� ��", eng);
		System.out.printf("%5s : %5d\n", "�� ��", math);
		System.out.printf("%5s : %5d\n", "�� ��", phys);
		System.out.printf("%5s : %5d\n", "�� ��", cod);
		System.out.printf("%5s : %5d\n", "�� ��", getSum());
		System.out.printf("%5s : %5.2f\n", "�� ��", getAvg());
		for (int i = 0; i < 13; i++)
			System.out.print("--");
		System.out.println();

	}
	
}

