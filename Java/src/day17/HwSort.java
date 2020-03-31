package day17;

import java.util.*;

public class HwSort implements Comparator {
	//이미 정렬기준이 있는 클래스에 별도의 정렬기준으로 정렬을 하고자할 때
	// Comparator 인터페이스를 구현해서 정렬기준으로 사용할 클래스를 만들어주면 된다.
	// Comparator 는 compare()를 추상함수로 가지고 있고
	// 구현을 하게 되면 이 함수를 반드시 오버라이드 해야한다.
	// 정렬할 때 sort()가 호출이 되면 이 함수는 정렬기준으로 사용할 클래스의 compare()를 
	// 자동 호출해서 정렬을 하게 된다.

	@Override
	public int compare(Object o1, Object o2) {
		//우리는 Sagak 클래스의 width를 기준으로 다시 정렬하고자 한다.
		//따라서 매개변수로 입력된 Object 타입의 데이터를 Sagak클래스로 강제 형변환 해줘야 겠다.
		Sagak s1 = (Sagak) o1;
		Sagak s2 = (Sagak) o2;
		
		int result = (int)(s1.getWidth() - s2.getWidth());
		// 이때 결과가 양수이면 자리를 바꾸고 
		// 0 이면 바꾸지 않고
		// 음수이면 자리를 바꾸고...
		
		return 0;
	}

}
