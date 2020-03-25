package day13;

import java.util.*;
import static java.lang.Math.*;
public class Main {
	
	public Main(){
		ArrayList list = new ArrayList();
		ArrayList list2 = null;
		
		for(int i =0 ; i < 10 ; i++ ) {
			list2 = new ArrayList();
			for(int j = 0 ; j < 2 ; j++ ) {
				list2.add((int)(random()*20 + 1));
			}
			
			int no = (int)(random()*3 + 1);// 3가지 난수를 구한다
			
			Figure f = null;
			if(no == 1) {// 난수에서 1번이 나오면 Nemo를 출력
				Nemo nemo = new Nemo();
				nemo.getArea((int)list2.get(0), (int)list2.get(1));
				f = nemo;
			} else if(no == 2) {
				Semo semo = new Semo();
				semo.getArea((int)list2.get(0), (int)list2.get(1));
				f = semo;
			} else {
				Won won = new Won();
				won.getArea((int)list2.get(0), (int)list2.get(1));
				f = won;
			}
			
			list.add(f);
		}
		
		for(int i = 0 ; i < list.size(); i++ ) {
			Figure f = (Figure) list.get(i);
			f.toPrint(i);
		}
		
	}
	public static void main(String[] args) {
		new Main();
	}

}
