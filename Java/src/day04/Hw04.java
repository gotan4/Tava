package day04;
/*
 	두사람이 등산을 하는데
 	한사람은 이제 등산을 0.54m/s 시작하고
 	한사람은 정상에서 1.07m/s 내려오기 시작했다.
 	
 	산의 높이가 7564m라고 가정하고
 	두사람이 만나는 시간은 몇분 몇초 후 인지와 높이를 출력해주는 프로그램을 작성하세요.
 	
 */
public class Hw04 {

	public static void main(String[] args) {
		int tHeight = 7564;
		for (int i = 0; ; i++) {//1초 지난후 올라가는 사람의 높이는 
				double h1 = 0.54 * i;
				double h2 = tHeight-(1.07 * i);
					
				if(h1 > h2 ) {
					System.out.println("올라가는 사람의 높이 : " + h1);
					System.out.println("내려가는 사람의 높이 : " + h2);
					System.out.println("두사람이 만난 직후 시간 : " + i/60 + "분 " + i%60 +" 초");
					break;		
			}
			
		}
	}

}
