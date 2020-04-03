package day20;
import java.util.*;
import javax.swing.*;
import java.sql.*;
public class Ex01 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/*
	 	문제 1]
	 		emp 테이블의 사원중
	 		급여가 제일 낮은 사원의
	 			사원번호, 사원이름, 급여, 부서번호, 부서이름, 부서위치를 꺼내서 보여주세요.
	 */

	public Ex01() {
		
		
		
	
	}
	
	public void dbInit() {
		try {
			// 드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오고
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

