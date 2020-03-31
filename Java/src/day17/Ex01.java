package day17;

/*
	 학생 성적을 관리하기 위한 클래스를 제작하세요.
	 변수 
	 	String name;
	 	int ban;
	 	int no;
	 	int kor, eng, math, physics, cod, total;
	 	
	 과목점수는 객체를 만들때 랜덤하게 입력되는 것으로 하고
	 반은 한반으로만 하고
	 데이터를 입력해서
	 총점이 높은 순으로 정렬해서
	 출력하세요.
	 
	 
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		ArrayList<Stud> list = new ArrayList<Stud>();
		String name[] = {"손은진","김수진","이한철","김성현","이진수","김이슬","서동혁","박기윤","이명환","우현우"}; 
		List<String> nameList = Arrays.asList(name);
		
		for(int i=0; i<10; i++) {
			String str = nameList.get(i);
			int no1 = (int)(Math.random()*101);
			int no2 = (int)(Math.random()*101);
			int no3 = (int)(Math.random()*101);
			int no4 = (int)(Math.random()*101);
			int no5 = (int)(Math.random()*101);
			list.add(new Stud(str,no1,no2,no3,no4,no5));
			
//			System.out.print("no1 : " + no1 + "\nno2 : " + no2 + "\nno3 : " + no3 + "\nno4 : "+ no4 + "\nno5 : "+no5);
//			System.out.println();
		}
		
		Collections.sort(list);
		for(Stud s : list) {
			System.out.print("이름 : "+ s.getName()+" | "+" Kor : "+s.getKor() + " | " +"Eng : "+s.getEng() + " | " + "Math : "+s.getMath() + " | " + "physics : "+s.getPhysics() + " | " + "cod : "+s.getCod() + " | ");
			System.out.println("total : "+s.getTotal() + " | ");
		}
		System.out.println();
		

		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}