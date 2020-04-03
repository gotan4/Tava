package day20;

/*
	이 클래스는 JDBC를 테스트 하기 위한 클래스
	
	오라클에 만들어 놓은 hello 계정에 접속해서
	member 테이블에 데이터를 채워보자.
	
 */
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class Test01 {

	public Test01() {
		// 할일
		/*
			1. JDBC라고 외부 데이터베이스를 연결할 드라이버는 이미 추가를 해놓았다.
				이제 이 프로그램에서 그 드라이버를 가지고 와야 한다.
				외부 클래스를 로딩하는 함수
					
					Class.forName(클래스이름)
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. 이제 드라이버 로딩은 끝난 상태다.
			System.out.println("*** DB Driver Loading Complete!!! ***");
			
			// 2. 연결을 시도해 보자.
			/*
					각각의 데이터베이스 마다 접속하는 방법(URL)이 약간씩 다르다.
					이 방법 역시 구글신의 도움을 청하세요...
					
					접속하는 방법은 JDBC에게 명령을 하면 된다.
					DriverManager.getConnection();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			// 이 url은 데이터베이스마다 조금씩 달라진다.
			Connection con = DriverManager.getConnection(url, user, pw);
			/*
				이처럼 접속을 하게 되면 접속자를 관리하는 세션을 제공하는데
				이 세션을 관리하는 클래스가 바로 Connection 이다.
				
				여기까지가 데이터베이스들 마다 조금씩 내용이 달라지는 부분이다.
				
				이후부터는 항상 동일한 방식으로 JDBC에게 명령을 내리면
				JDBC가 해당 DBMS에게 명령을 전달한다.
			 */
			JOptionPane.showMessageDialog(null, "*** Oracle Connect Complete!!! ***");
			
			// 이제 오라클에 접속도 되었고 이제 질의명령을 보내보자.
			// 3. Statement 만든다.
			Statement stmt = con.createStatement();
			
			// 4. 질의 명령을 만들고
			ArrayList<String> avtList = new ArrayList<String>();
			avtList.add("INSERT INTO AVT VALUES(11, 'img_avatar1.png', 'img_avatar1.png', 'M')");
			avtList.add("INSERT INTO AVT VALUES(12, 'img_avatar2.png', 'img_avatar2.png', 'M')");
			avtList.add("INSERT INTO AVT VALUES(13, 'img_avatar3.png', 'img_avatar3.png', 'M')");
			avtList.add("INSERT INTO AVT VALUES(14, 'img_avatar4.png', 'img_avatar4.png', 'F')");
			avtList.add("INSERT INTO AVT VALUES(15, 'img_avatar5.png', 'img_avatar5.png', 'F')");
			avtList.add("INSERT INTO AVT VALUES(16, 'img_avatar6.png', 'img_avatar6.png', 'F')");
			
			
			String sql01 = "INSERT INTO MEMB VALUES( 1000, '전은석', 'euns', '12345', 'euns@increpas.com', 'M', '010-3175-9042', 11, 'Y')";
			String sql02 = "INSERT INTO MEMB VALUES( 1001, '최두용', 'dDragon', '12345', 'dDragon@increpas.com', 'M', '010-9292-4184', 11, 'Y')";
			String sql03 = "INSERT INTO MEMB VALUES( 9999, '김수진', 'chairman', '12345', 'chairman@increpas.com', 'F', '010-9999-9999', 14, 'Y')";
			// 이제 Statement 에 질의 명령을 실어서 보내면 된다.
			/*
			int cnt = 0 ;
			for(int i = 0 ; i < avtList.size(); i++ ) {
				cnt += stmt.executeUpdate(avtList.get(i));
			}
			JOptionPane.showMessageDialog(null, "입력된 데이터 수 : " + cnt);
			 */
			
			/*
			// 회원도 추가해보자.
			stmt.execute(sql01);
			stmt.execute(sql02);
			stmt.execute(sql03);
			*/
			
			
			String sql04 = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM MEMB WHERE mno = 1000";
			ResultSet rs = stmt.executeQuery(sql04);
			// 현재 작업줄은 BOF 이므로 실제 데이터 들어있는 행으로 한행 내려야 된다.
			rs.next();
			/*
			int mno = rs.getInt(1);
			String name = rs.getString(2);
			String mid = rs.getString(3);
			String mpw = rs.getString(4);
			String mail = rs.getString(5);
			String gen = rs.getString(6);
			String tel = rs.getString(7);
			int ano = rs.getInt(8);
			char isshow = rs.getString(9).charAt(0);
			*/
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
			char isshow = rs.getString("status").charAt(0);
			
			JOptionPane.showMessageDialog(null, "<html><b style=\"color: blue;\">###  &nbsp;&nbsp;" + name + " 선생님 정보 &nbsp;&nbsp;###</b></html>\n회원번호 : " + mno + 
					"\n회원아이디 : " + mid + "\n회원비번 : " + mpw + "\n회원메일 : " + mail + 
					"\n회원성별 : " + gen + "\n회원전화 : " + tel + "\n아바타번호 : " + ano +
					"\n활동여부 : " + ((isshow == 'Y') ? "활동중" : "탈퇴회원")
					);
			
			/*
			if(bool) {
				JOptionPane.showMessageDialog(null, "*** 질의명령 결과 발생 ***");
			} else {
				JOptionPane.showMessageDialog(null, "*** 질의명령 결과 없음 ***");
			}
			*/
			
			/*
			String dsql = "TRUNCATE TABLE MEMBER";
			
			stmt.execute(dsql);
			*/
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
