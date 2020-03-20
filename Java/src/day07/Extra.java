package day07;

import java.util.Arrays;

/*
	문제 4]
		전화번호를 입력하면
		'-'를 기준으로 데이터를 분리해서
		저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
		indexOf()
		substring()
 */
import javax.swing.*;
public class Extra {

	public static void main(String[] args) {
		// 전화번호는 xxx-xxx-xxxx-xxxx 의 형식으로 입력받을 것이고
		// 이 번호를 문자열로 저장하고
		// 문자열중에 - 의 갯수만큼 반복해서
		// 번호를 나누고 배열에 저장하면 된다.
		
		// 1. 먼저 입력받아서 변수에 저장하고
		String phone = JOptionPane.showInputDialog("전화번호를 입력하세요!");
		// 2. '-' 의 갯수를 카운트하고
		int cnt = 0;
		for(int i = 0 ; i < phone.length(); i++ ) {
			char ch = phone.charAt(i);
			if(ch < '0' || ch > '9') ++cnt;
		}
		
		// 3. 분리된 문자열을 입력할 배열을 만들고
		// 	==> 전화번호를 분리를 하게 되면 '-'의 갯수보다 1개가 더 많은 문자열로 분리가 된다.
		String[] arr = new String[cnt + 1];
		
		// 4. 배열에 문자열을 짤라서 입력하고
		// 잘려진 문자열을 저장할 변수(작업할 변수) 만든다.
		// 처음에는 전체 문자열이 모두 저장이 되어야 될 것이다.
		String tmp = phone;
		int idx = 0 ;
		for(int i = 0 ; i < cnt ; i++ ) {
			// '-' 의 인덱스를 알아낸다.
			idx = tmp.indexOf('-');
			
			// 이제 '-'의 인덱스는 알아냈으니 
			// '-' 이전까지의 문자열을 추출해내면 된다.
			arr[i] = tmp.substring(0, idx);
			
			// 이제 뒷 번호를 다시 짤라서 tmp에다 저장해 놓고
			// 다시 위의 명령들을 반복하면 된다.
			tmp = tmp.substring(idx+1);
		}
		arr[cnt] = tmp;
		// 5. 출력하고
		JOptionPane.showMessageDialog(null, "입력한 번호 : " + phone +
											"\n분리해 놓은 배열 : " + Arrays.toString(arr));
	}

}
