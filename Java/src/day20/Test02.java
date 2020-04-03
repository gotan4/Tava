package day20;

/*
	회원번호를 입력하면 
	데이터베이스의 회원 정보를 조회해주는 프로그램을 작성하세요.
 */
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class Test02 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Test02() {
		dbInit();
		
		// 회원번호를 입력받는다.
		int no = -1;
		while(true) {
			String sno = JOptionPane.showInputDialog("조회할 회원번호를 입력하세요!");
			try {
				no = Integer.parseInt(sno);
				break;
			} catch(Exception e) {
				e.printStackTrace();
				continue;
			}
		}
		
		// 질의명령을 만든다.
		String sql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM MEMB WHERE mno = " + no;
		String psql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM MEMB WHERE mno = ?";
		
		
		try {
			/*
			// Statement를 얻어오고
			stmt = con.createStatement();
			// 질의 명령 실어서 보내고
			rs = stmt.executeQuery(sql);
			*/
			
			// ? 를 채워줘야하는 질의 명령을 사용할 때 사용하는 Statement 는 PreparedStatement 이다.
			pstmt = con.prepareStatement(psql);
			// PreparedStatement 는 질의명령을 가지고 만들어야 하고
			// 만들어진 후에는 질의 명령을 완성해야 질의 명령이 정상적으로 작동할 것이다.
			
			// 질의명령 완성하고
			pstmt.setInt(1, no);
			
			// 질의 명령 보내고 결과 받고
			rs = pstmt.executeQuery();			
			
			// 작업줄 한줄 내리고
			rs.next();
			
			// 필요한 데이터 뽑아오고...
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
			char isshow = rs.getString("status").charAt(0);
			
			// 보여주고
			JOptionPane.showMessageDialog(null, "<html><b style=\"color: blue;\">###  &nbsp;&nbsp;" + 
													name + ((name.equals("전은석")) ?" 선생님 ": (name.equals("김수진")? " 회장님 ": " 씨 ") )+ "정보 &nbsp;&nbsp;###</b></html>\n회원번호 : " + mno + 
					"\n회원아이디 : " + mid + "\n회원비번 : " + mpw + "\n회원메일 : " + mail + 
					"\n회원성별 : " + gen + "\n회원전화 : " + tel + "\n아바타번호 : " + ano +
					"\n활동여부 : " + ((isshow == 'Y') ? "활동중" : "탈퇴회원")
					);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 
	}
	
	// 데이터베이스 드라이버 로딩하고 커넥션 얻어주는 함수
	public void dbInit() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("*** 커넥션 얻어오기 성공 ***");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
