package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_palindrome02 {
/*
	100x100 문자판에서 존재하는 회문수 중에서 가장 긴 회문수를 찾아서
	그 길이를 반환하는 프로그램을 작성하세요.
	
	회문수의 길이가 지정되어있지 않기때문에 1부터 100까지의 길이를 모두 체크해주어야한다.
	이후, 회문수를 찾았을 때 그 길이를 저장하여 모아둘 배열이 필요하다. >> 정렬 
 */
	
	public static void main(String[] args) {
		//입력준비 
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 10개
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt(); //테스트케이스 번호 입력받기
			char[][] letters = new char[100][100]; //문자를 저장할 2차원배열 
			ArrayList<Integer> list = new ArrayList<Integer>(); //회문수를 찾았을 때 그 길이를 저장할 리스트 
			String ori, rvs;
			
			for(int i = 0; i < 100; i++) { //배열에 데이터를 저장할 반복문 
				String str = sc.next();
				for(int j = 0; j < 100; j++) {
					letters[i][j] = str.charAt(j);
				}
			}
			
			//회문수 찾아보기 
			for(int i = 0; i < 100; i++) {
				for(int len = 2; len <= 100; len++) {
					for(int j = 0; j < 100-len; j++) {
						ori = "";
						rvs = "";
						for(int k = 0; k < len; k++) {
							ori += letters[i][j+k];
						}
						//ori 문자열 뒤집기
						for(int k = ori.length()-1; k >= 0; k--) {
							rvs += ori.charAt(k);
						}
						//비교
						if(ori.equals(rvs)) {
							//동일하다면 회문수이므로, 해당 len를 list에 저장
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
						//ori 문자열 뒤집기
						for(int k = ori.length()-1; k >= 0; k--) {
							rvs += ori.charAt(k);
						}
						//비교
						if(ori.equals(rvs)) {
							//동일하다면 회문수이므로, 해당 len를 list에 저장
							list.add(len);
						}
					}
				}
			}
			
			//오름차순 정렬 
			Collections.sort(list);
			//출력하기 
			System.out.println("#" + test_case + " " + list.get(list.size()-1));
		}
	}//main

}