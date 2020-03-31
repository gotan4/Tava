package day16;

// MessageFormat
// 		db  질의 명령을 제작하는데 사용해 보자.
import java.text.*;
public class Test06 {

	public Test06() {
		String sql = "INSERT INTO member VALUES(1234, '홍길동', '010-1111-1111', 24)";
		// 이 질의 명령에서 데이터만 따로 꺼내고 싶다.
		
		// MessageFormat에서 데이터가 들어갈 부분을 명시한 패턴을 만든다.
		
		// form을 만들고
		MessageFormat form = new MessageFormat("INSERT INTO member VALUES({0}, {1}, {2}, {3})") ;
		
		// 이제 데이터를 담을 배열을 선언하고
		Object[] result = null;
		
		try {
			result = form.parse(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < result.length ; i++ ) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
