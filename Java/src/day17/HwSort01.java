package day17;

import java.util.*;

public class HwSort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 1. 삼각형 타입으로 강제 형변환 하고
		Samgak s1 = (Samgak) o1;
		Samgak s2 = (Samgak) o2;
		// 2. 넓이 비교해서 결과값 얻어내고
		int result = (int)(s1.getArea() - s2.getArea());
		// 3. 결과값 반환해주고
		return result;
	}

}
