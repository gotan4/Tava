package day17;

import java.util.Comparator;

public class Sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Semo s1 = (Semo) o1;
		Semo s2 = (Semo) o2;
		
		int result = (int) (s1.getArea() - s2.getArea());
		
		return 0;
	}




}
