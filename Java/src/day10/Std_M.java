package day11.preSolv;

public class Ex04Solv {
	
	public Ex04Solv() {
		// ���� �ټ����� �̸��� ������ �迭�� ������.
		String[] name = {"������", "�ڱ���", "������", "�ڱ�ȣ", "����ö"};
		
		// �ټ����� �����͸� ������ �迭�� �����.
		Std[] ban = new Std[5];
		
		ban = setArr1(ban, name);
		
		// �迭�� �ϼ��� �Ǿ���
		// �����غ���.
		
		ban = setSort1(ban);
		
		// ����Ѵ�.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��");
		System.out.println("----------------------------------------------------------");
		for(int i = 0 ; i < ban.length ; i++ ) {
			ban[i].toPrint();
		}
		System.out.println("***********************************************************");
		System.out.println();
		
		setArr(ban, name);
		setSort(ban);
		// ����Ѵ�.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��");
		System.out.println("----------------------------------------------------------");
		for(int i = 0 ; i < ban.length ; i++ ) {
			ban[i].toPrint();
		}
	}
	
	// �����μ��� �̸��� �Է¹޾Ƽ� �迭�� �������ִ� �Լ��� ����� ����.
	// �׷��� �����μ��� �տ��� �Ϲ� ������ �͵� ���������, �ڿ��� ���� ����� �ȵȴ�.
	
	public Std[] setArr1(Std[] s, String...name) {
		for(int i = 0 ; i < name.length ; i++ ) {
			s[i] = new Std(name[i]);
		}
		return s;
	}
	
	public void setArr(Std[] s, String...name) {
		for(int i = 0 ; i < name.length ; i++ ) {
			s[i] = new Std(name[i]);
		}
	}
	
	// Stud Ÿ���� �迭�� �Է����ָ������� �ִ� �Լ��� ������.
	public Std[] setSort1(Std[] s) {
		for(int i = 0 ; i < s.length - 1 ; i++ ) {
			for(int j = i + 1 ; j < s.length ; j++ ) {
				if(s[i].getSum() < s[j].getSum()) {
					Std tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
		
		return s;
	}
	
	public void setSort(Std[] s) {
		for(int i = 0 ; i < s.length - 1 ; i++ ) {
			for(int j = i + 1 ; j < s.length ; j++ ) {
				if(s[i].getSum() < s[j].getSum()) {
					Std tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04Solv();
	}

}