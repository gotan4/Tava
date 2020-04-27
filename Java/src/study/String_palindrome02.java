package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_palindrome02 {
/*
	100x100 �����ǿ��� �����ϴ� ȸ���� �߿��� ���� �� ȸ������ ã�Ƽ�
	�� ���̸� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���.
	
	ȸ������ ���̰� �����Ǿ����� �ʱ⶧���� 1���� 100������ ���̸� ��� üũ���־���Ѵ�.
	����, ȸ������ ã���� �� �� ���̸� �����Ͽ� ��Ƶ� �迭�� �ʿ��ϴ�. >> ���� 
 */
	
	public static void main(String[] args) {
		//�Է��غ� 
		Scanner sc = new Scanner(System.in);
		
		//�׽�Ʈ���̽� 10��
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt(); //�׽�Ʈ���̽� ��ȣ �Է¹ޱ�
			char[][] letters = new char[100][100]; //���ڸ� ������ 2�����迭 
			ArrayList<Integer> list = new ArrayList<Integer>(); //ȸ������ ã���� �� �� ���̸� ������ ����Ʈ 
			String ori, rvs;
			
			for(int i = 0; i < 100; i++) { //�迭�� �����͸� ������ �ݺ��� 
				String str = sc.next();
				for(int j = 0; j < 100; j++) {
					letters[i][j] = str.charAt(j);
				}
			}
			
			//ȸ���� ã�ƺ��� 
			for(int i = 0; i < 100; i++) {
				for(int len = 2; len <= 100; len++) {
					for(int j = 0; j < 100-len; j++) {
						ori = "";
						rvs = "";
						for(int k = 0; k < len; k++) {
							ori += letters[i][j+k];
						}
						//ori ���ڿ� ������
						for(int k = ori.length()-1; k >= 0; k--) {
							rvs += ori.charAt(k);
						}
						//��
						if(ori.equals(rvs)) {
							//�����ϴٸ� ȸ�����̹Ƿ�, �ش� len�� list�� ����
							list.add(len);
						}
					}
				}
			}
			
			for(int i = 0; i < 100; i++) {
				for(int len = 2; len <= 100; len++) {
					for(int j = 0; j < 100-len; j++) {
						ori = "";
						rvs = "";
						for(int k = 0; k < len; k++) {
							ori += letters[j+k][i];
						}
						//ori ���ڿ� ������
						for(int k = ori.length()-1; k >= 0; k--) {
							rvs += ori.charAt(k);
						}
						//��
						if(ori.equals(rvs)) {
							//�����ϴٸ� ȸ�����̹Ƿ�, �ش� len�� list�� ����
							list.add(len);
						}
					}
				}
			}
			
			//�������� ���� 
			Collections.sort(list);
			//����ϱ� 
			System.out.println("#" + test_case + " " + list.get(list.size()-1));
		}
	}//main

}