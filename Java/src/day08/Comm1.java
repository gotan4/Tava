package day08;

import java.util.Arrays;

public class Comm1 {

	public static void main(String[] args) {
		String str = "PengSoo Good!";
		//���ڿ��� �ϳ��� ������ �迭�� ����
		char[] arr = new char[12];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
