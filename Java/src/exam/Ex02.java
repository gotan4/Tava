package exam;

/*
	문제 2 ]
	
	link : https://www.nytimes.com/2020/03/29/world/coronavirus-live-news-updates.html?action=click&module=Spotlight&pgtype=Homepage

"President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion."

단어단위로 문자열을 잘라서
단어길이가 제일 긴 단어의 글자수와 단어를 출력하세요.

단, ,와 . , - 그리고 ? 는 단어에서 제외한다.

 */

import java.util.*;

import javax.swing.JOptionPane;
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter. "+
					"He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.";
		
		/*
			참고 ]
				
				거의 대부분의 언어에서 문자열 자체를 변경하는 기능은 없다.
				변경하는 작업을 하는 함수들은 변경 결과를 반환하는 기능만 가지고 있다.
		 */
		String tmp = str.replaceAll("\n", " ").replaceAll(",", "").replaceAll("\\.", "").replaceAll("\\?", "").replaceAll("-", "");
		/*
		String str1 = "abcd123";
		
		String tmp1 = str1.replaceAll("a", "");
		System.out.println(str1);
		System.out.println(tmp1);
		*/
		
//		System.out.println(tmp);
		
		// 이제 단어를 공백을 기준으로 ArrayList에 담자
		// 금욜날 우리는 아주 편한 기능을 하나 배웠는데 그것이 StringTokenizer 였다.
		StringTokenizer token = new StringTokenizer(tmp);
		
		//  이제 공백을 기준으로 잘려진 결과가 버퍼메모리에 저장이 되어있으므로 하나씩 꺼내서 담으면 되겠다.
		// 참고로 ArrayList는 사이즈를 지정해주지 않아도 만들수 있으므로 그대로 담자.
		
		// ArrayList 만들고
		ArrayList list = new ArrayList();
		
		// token에서 하나씩 꺼내서 채워넣자.
		while(token.hasMoreTokens()) { // 아직 버퍼메모리에 꺼낼 데이터가 남아있니??
			list.add(token.nextToken());
		}
		
		// 출력해보고
		for(Object obj : list) {
			System.out.println((String) obj + "######");
		}
		
		// 이제 리스트에 들어있는 단어들의 길이를 뽑아서
		// 제일 긴 단어의 길이와 단어를 출력한다.
		
		// 먼저 제일 긴 단어의 길이와 단어를 저장할 변수를 만들고
		int len = 0 ;
		String word ="";
		for(int i = 0 ; i < list.size(); i++ ) {
			String daneo = (String)list.get(i);
			int gilee = daneo.length();
			
			if(len < gilee) {
				len = gilee;
				word = daneo;
			}
		}
		
		// 이제 제일 긴 단어의 길이와 단어가 결정이 되었으니 출력해주자.
		JOptionPane.showMessageDialog(null, "제일 긴 단어의 길이 : " + len + "\n" + "제일 긴 단어 : " + word);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
