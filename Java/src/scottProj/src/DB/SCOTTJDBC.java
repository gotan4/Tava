package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SCOTTJDBC {
	/*
		�� Ŭ������ new ��Ű�� ����
		�⺻������ ���� �ʿ��� ����̹��ε� �۾��� ���ÿ� ������ ���̴�.
	 */
	private String user;
	private String pw;
	private String url;
	
	public SCOTTJDBC() {
		this("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	}
	
	public SCOTTJDBC(String url, String user, String pw) {
		this.user = user;
		this.pw = pw;
		this.url = url;
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Ŀ�ؼ� ������ �Լ�
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// Statement ������ �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
				* ReusltSet�� Type
					1) TYPE_FORWARD_ONLY : scroll�� �Ұ����� forwad only ��
					2) TYPE_SCROLL_INSENSITIVE : scroll�� �����ϳ�, ����� ������ ������� ����
					3) TYPE_SCROLL_SENSITIVE : scroll�� �����ϸ�, ����� ������ �����
	
				* CONCURRENCY�� TYPE
					1) CONCUR_READ_ONLY : resultset object�� ������ �Ұ���
					2) CONCUR_UPDATABLE : resultset object�� ������ ����
			*/
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	// PreparedStatement ������ �Լ�
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// �ʿ䰡 ���� ��� ��� �ݾ��ִ� �Լ�
	public void close(Object o) {
		try{
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}

}
