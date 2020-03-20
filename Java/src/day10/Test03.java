package day10;

/*
	Nemo 클래스를 5개 관리한 배열을 만들고
	가로 세로는 1 ~ 29 까지 랜덤하게 만들어서 배열을 완성하자.
	
	그리고 각 네모의 가로, 세로, 넓이를 출력해보자.
 */
public class Test03 {
	// Nemo 배열변수를 만들자
	Nemo[] nemo;
	
	// 네모를 초기화하는 함수를 만들자.
	public void setNemo() {
		// 먼저 배열을 초기화 해준다.
		nemo = new Nemo[5];
		
		// 아직 nemo에는 데이터는 채워져 있지 않고 데이터가 들어갈 방만 만들어 놓은 상태다.
		// 각 방에 데이터를 넣어주자.
		for(int i = 0 ; i < nemo.length ; i++ ) {
			// 반복문이 한번 반복될때 마다
			// Nemo 클래스의 인스턴스를 만들어서 각방에 넣어줘야 한다.
			nemo[i] = new Nemo();
			
			// Nemo 인스턴스는 만들어 뒀는데 아직 가로, 세로, 넓이는 입력않았다.
			// 따라서 현재 가로 세로 넓이는 0으로 셋팅이 되어있다.
			// 이제 가로 세로 넓이를 셋팅을 해주자. 우리는 그것의 기능을 만들어 뒀으므로 그 기능을 사용해 보자.
			//	먼저 숫자 두개를 만든다.
			int garo = (int)(Math.random()*(29 - 1 + 1) + 1);
			int sero = (int)(Math.random()*(29 - 1 + 1) + 1);
			nemo[i].setVal(garo, sero);
		}
	}
	
	public static void main(String[] args) {
		Test03 t = new Test03(); // 아직 멤버변수 nemo는 셋팅되어 있지 않다.
		Test03 t1 = new Test03(); // 아직 멤버변수 nemo는 셋팅되어 있지 않다.
		
		t.setNemo(); // nemo 를 셋팅해준다.
		
		// 출력해준다. 우리는 멤버변수의 내용을 출력해주는 함수를 만들어 뒀다. 그것을 호출하자.
		for(int i = 0 ; i < t.nemo.length ; i++ ) {
			t.nemo[i].toPrint();
		}
		System.out.println();
		System.out.println("##########");
		
		/*
		// t1도 시험삼아 출력한다.
		for(int i = 0 ; i < t1.nemo.length ; i++ ) {
			t1.nemo[i].toPrint();
		}
		*/
		
	}

}
