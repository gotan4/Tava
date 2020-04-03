package day20;

/*
	
	회원들의 
		이름, 아이디, 성별, 아바타번호
	를 조회해서 보여주세요.
	
 */

import java.util.*;
import java.sql.*;
import javax.swing.*;
public class Test03 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Test03() {
		dbInit();
		// 질의 명령 작성하고
		String sql = "SELECT name, id, gen, ano FROM MEMB WHERE isshow = 'Y'";
		
		StringBuffer buff = new StringBuffer();
		try {
			// 스테이트먼트 가져오고
			stmt = con.createStatement();
			// 질의명령이 이미 완성이 되어 있으니 스테이트먼트에 실어서 보내고 결과를 받으면 된다.
			rs = stmt.executeQuery(sql);
			// 질의명령의 결과가 여러행인 경우는 반복해서 작업을 해주면 된다.
			while(rs.next()) {
				buff.append(rs.getString("name") + " | "); 	// 이름 붙여주고
				buff.append(rs.getString("id") + " | "); 	// 아이디 붙여주고
				buff.append(rs.getString("gen") + " | "); 	// 성별 붙여주고
				buff.append(rs.getInt("ano") + "\n"); 		// 아바타번호 붙여주고
			}
			
			// 결과 보여주고
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
	
	public void dbInit() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

