package day07;

/*
	예제 ]
		로또 한 게임을 만들어서 배열에 담고
		낮은 번호부터 정렬해서 
		담긴 데이터를 출력해보자.
		
		로또 한 게임은
			1 ~ 45 까지의 숫자가 6개 가 필요하다.
 */

import java.util.*;
import javax.swing.*;
public class ArraySort01 {

	public static void main(String[] args) {
		// 할일
		// 1. 정수 6개가 저장될 배열을 만든다.
		int[] lotto = new int[6];
		
		loop:
		for(int i = 0 ; i < lotto.length ; i++ ) {
			// 2. 배열에 랜덤하게 정수를 만들어서 
			int no = (int)(Math.random()*(45 - 1+ 1) + 1);
			// 3. 이전에 만들어진 같은 번호가 있는지 체크하고
			for(int j = 0 ; j < i ; j++ ) {
				if(lotto[j] == no) { // 이제까지 발생된 번호와 같은 번호면..
					i--;
					continue loop;
				}
			}
			// 이 부분을 실행하는 경우는 위의 반복문이 모두 실행이 된 경우고
			// 그 의미는 같은 번호가 이전에는 없다는 의미이므로
			// 4. 각 방에 그 번호를 저장하고
			lotto[i] = no;
		}
		// 5. 출력하고
		JOptionPane.showMessageDialog(null, "*** 당첨번호 ***\n" + 
												Arrays.toString(lotto));
		// 6. 정렬을 하고
		for(int i = 0 ; i < lotto.length - 1 ; i++ ) {
			// 여기서 비교할 데이터는 맨 마지막 데이터는 비교할 필요가 없으므로 
			// 맨 마지막 바로 이전까지만 뽑아서 비교해주면 된다.
			
			// 꺼낸 데이터 이후부터 맨 마지막까지 하나씩 꺼내서 비교한다.
			for(int j = i + 1; j < lotto.length ; j++ ) {
				if(lotto[i] > lotto[j]) {
					// 이 경우는 뒤에서 뽑아온 데이터가 더 작은 경우이므로
					// 현재 자리와 데이터를 교체 해야 한다.
					// 이 때 현재 자리에 데이터를 교체 하는 순간 이전 데이터의 기억은 사라지므로
					// 변수에 주소를 기억시켜 놓는다.
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		// 7. 출력하고 ☆
		JOptionPane.showMessageDialog(null, "<html><b style=\"color: blue;\">☆☆☆ 당첨 예정 번호 ☆☆☆</b></html>\n" + 
												Arrays.toString(lotto));
		JOptionPane.showMessageDialog(null, "<html><b style=\"color: green;\">★★★ 당첨 예정 번호 ★★★</b></html>\n\t" + 
												Arrays.toString(lotto), "*** Lotto ***", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
