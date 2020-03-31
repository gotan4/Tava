package day17;

import java.util.*;
public class Nemo_Comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Nemo)o1).getArea() - ((Nemo) o2).getArea();
	}

}
