package MyProj.test;

import java.sql.*;

import DB.*;

public class Test01 {
	ORCLJDBC db;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public Test01() {
		db = new ORCLJDBC();
		// Connection 가져오고
		con = db.getCon();
		
		// 질의명령
		String sql = "SELECT mno, name, id FROM member WHERE mno = ";
		
		// 회장님 정보를 가져와보자.
		sql = sql + 9999;
		
		int mno = 1000;
		String tel = "'010-7777-7777'";
		
		String sql1 = "UPDATE member SET tel = " + tel + " WHERE mno = " + mno;
		
		// Statement 가져오고
		stmt = db.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			// rs 에서 데이터 꺼내고
			
			stmt.executeUpdate(sql1);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
