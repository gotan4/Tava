package day06;

/*
	10.
		1
		2  3
		4  5  6
		7  8  9  10
		11 12 13 14 15
 */
public class Solv10 {
	public Solv10() {
		solv2();
	}
	public static void main(String[] args) {
		Solv10 s10 = new Solv10();
		s10.solv1();
	}
	
	public void solv1() {
		System.out.println("######### solv1() ##########");
		int no = 1;
		int i = 0;
		while(i < 5) {
			
			int j = 0 ;
			while(j <= i) {
				System.out.printf("%3d", no++);
				j++;
			}
			System.out.println();
			// while �������� ī���� ���� �������� ������ ó������� �Ѵ�.
			i++;
		}
	}
	
	public void solv2() {
		for(int i = 0 ; i < 5 ; i++) {
			// �� ���� ���� ���� �����
			int no = 1;
			for(int j = 0 ; j <= i ; j++) no += j;
			
			// �� ���� �� ���� ���� ����ϱ�
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.printf("%3d", no + j);
			}
			
			System.out.println();
		}
		
	}

}
