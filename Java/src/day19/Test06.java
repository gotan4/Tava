package day19;

/*
	예제 6 ]
		doc 폴더의 파일의 목록을 알아내자.
 */
import java.io.*;
import javax.swing.*;
public class Test06 {

	public Test06() {
		// 1. 목록을 알아내고싶은 폴더를 파일로 만든다.
		File dir = new File("src/day19/etc");
		/*
		String[] list = dir.list();
		for(int i = 0 ; i < list.length ; i++ ) {
			String fname = list[i];
			System.out.println(fname);
		}
		*/
		
		/*
		File[] fList = dir.listFiles();
		for(int i = 0 ; i < fList.length ; i++ ) {
			File fileInfo = fList[i];
			String filename = fileInfo.getName(); // 파일 이름 꺼내기
			long len = fileInfo.length(); // 파일 크기 꺼내고
			String folder = fileInfo.getParent(); // 폴더 꺼내고
			
			// 출력하기
			System.out.print("파일이름 : " + filename + " | 폴더 : " + folder + " | 사이즈 : " + len +"\n");
		}
		*/
		
		/*
			특정 폴더에 있는 파일 중에서 확장자가 txt인 파일만 골라서 출력해보자.
			
			이런 경우 필터를 파일 목록을 가져올 때 입력해줘야 하는데...
			이 필터는 사용자의 목적에 따라서 조금씩 달라질 것이다.
			
			따라서 필터는 인터페이스로 제공을 해주고 있다.
			
			우리는 그 인터페이스를 구현해서 필요한 기능을 만들면 된다.
		 */
		
		String[] fileList = dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				boolean bool = false;
				/*
					매개변수의 역할
						File 	dir : 현재 파일의 정보를 알려준다.
						String name : 현재 파일의 이름만 알려준다.
						
					이 함수는 자동 호출되는 함수이다.
					목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
					
					따라서
					이 함수의 반환값이 true 이면 목록에 포함시키고
					반환값이 false 이면 목록에서 제외를 시킨다.
				 */
				/*
				if(name.endsWith("txt")) {
					bool = true;
				} else {
					bool = false;
				}
				*/
				return name.endsWith("txt");
			}
		});
		
		// fileList를 출력한다.
		int cnt = 0 ;
		for(String fName : fileList) {
			cnt++;
			System.out.println(fName);
		}
		JOptionPane.showMessageDialog(null, "txt 파일 검색 결과 수 : " + cnt);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
