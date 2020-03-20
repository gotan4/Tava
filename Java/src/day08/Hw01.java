package day08;

import java.util.Arrays;

/*
String[][] name = {{"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"},
				{"김수진", "손은진", "이한철", "이진수", "김성현"}};
String[] tel = {{"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555", 
				"010-6666-6666", "010-777-7777"},
				{"010-1111-1234","010-2222-1234","010-3333-1234","010-4444-1234","010-5555-1234"}};
String[] mail = {{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
							"yth@increpas.com","kjh@increpas.com", "lim@increpas.com"},
				{"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com",
				"ksh@increpas.com"}};
		
 */
public class Hw01{

	public static void main(String[] args) {
		String[][] name = {{"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"},
				{"김수진", "손은진", "이한철", "이진수", "김성현"}};
		String[][] tel = {{"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555", 
						"010-6666-6666", "010-777-7777"},
						{"010-1111-1234","010-2222-1234","010-3333-1234","010-4444-1234","010-5555-1234"}};
		String[][] mail = {{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
							"yth@increpas.com","kjh@increpas.com", "lim@increpas.com"},
						{"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com",
						"ksh@increpas.com"}};
		
		
		String[][][] ban = new String[2][][];
		
		for(int i = 0 ; i < name.length; i++ ) {
			
			String[][] team = new String[name[i].length][];
			for(int j = 0 ; j < name[i].length ; j++ ) {
				String[] people = new String[3];
				people[0] = name[i][j];
				people[1] = tel[i][j];
				people[2] = mail[i][j];
				team[j] = people;
			}
			ban[i] = team;
		}
		
		for(int i = 0 ; i < ban.length ; i++ ) {
			System.out.println("################ Team " + (i + 1) + " ###############");
			System.out.println("***************************************");
			
			for(int j = 0 ; j < ban[i].length ; j++ ) {
				System.out.println(Arrays.deepToString(ban[i][j]));
				System.out.println("---------------------------------------");
			}
			System.out.println("***************************************");
		}
	}

}
