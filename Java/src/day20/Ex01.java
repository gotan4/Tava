package day20;
import java.util.*;
import javax.swing.*;
import java.sql.*;
public class Ex01 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/*
	 	���� 1]
	 		emp ���̺��� �����
	 		�޿��� ���� ���� �����
	 			�����ȣ, ����̸�, �޿�, �μ���ȣ, �μ��̸�, �μ���ġ�� ������ �����ּ���.
	 */

	public Ex01() {
		
		
		
	
	}
	
	public void dbInit() {
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Ŀ�ؼ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}

