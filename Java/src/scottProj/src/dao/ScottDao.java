package dao;

/**
 * �� Ŭ������ ȸ���� ���õ� �����ͺ��̽� ó���۾��� �ϱ����� Ŭ�����̴�.
 * @author	������
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
	// �� Ŭ������ �����ͺ��̽� ó���۾��� ���� Ŭ�����̹Ƿ� �⺻������ 
	// �����ͺ��̽� ����̹��ε��� ���� �۾��� 
	// �� Ŭ������ ��ü�� �Ǵ� ���� �̷�� ���°��� ���� ���̴�.
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
