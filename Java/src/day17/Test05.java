package day17;

import java.util.*;
// �����ϰ� ���ڸ� 10�� ���� �÷��ǿ� ��� �������. ��, �ߺ����ڴ� �����ϰٴ�.

public class Test05 {

	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			int num = rnd.nextInt(45) +1;
			
			set.add(num);
			
			// �׷��� �츮�� ���� ������ �ֱ�� �ߴ�.
			// Set�� �ߺ��� �����͸� ������� �ʰ�
			// ���� �ߺ��� ���� �ԷµǸ� �Էµ� ũ��� ������ �ȵɰ��̴�.
			// set�� �Էµ� �������� ���� 10���� �Ǵ� ���� �� �ݺ����� ���ᰡ �Ǿ�� �ڴ�.
			
			if(set.size() == 10) {
				break;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
		System.out.println();
		System.out.println("--------------------Iterator--------------------");
		Iterator<Integer> itor = set.iterator();
		
		while (itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		new Test05();
	}

}
