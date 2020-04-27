package dao;

/**
 * 이 클래스는 회원에 관련된 데이터베이스 처리작업을 하기위한 클래스이다.
 * @author	전은석
 * @since	2020.04.03
 * @version	v.1.0
 * 
 */
import DB.*;
import java.sql.*;
import java.util.*;


import sql.*;
import vo.*;
public class ScottDao {
	// 이 클래스는 데이터베이스 처리작업을 위한 클래스이므로 기본적으로 
	// 데이터베이스 드라이버로딩과 같은 작업은 
	// 이 클래스가 객체가 되는 순간 이루어 지는것이 편할 것이다.
	SCOTTJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	ScottSQL sSQL;
	
	public ScottDao() {
		db  = new SCOTTJDBC();
		sSQL = new ScottSQL();
	}
	
	public int joinMember(EmpVO vo) {
		
		con = db.getCon();
		int cnt = 0;
		String sql = sSQL.getSQL(sSQL.SNAME);
		
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setString(1,em)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
