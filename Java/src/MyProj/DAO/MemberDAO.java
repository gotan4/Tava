package MyProj.DAO;

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
import MyProj.VO.*;
import MyProj.sql.*;
public class MemberDAO {
	// 이 클래스는 데이터베이스 처리작업을 위한 클래스이므로 기본적으로 
	// 데이터베이스 드라이버로딩과 같은 작업은 
	// 이 클래스가 객체가 되는 순간 이루어 지는것이 편할 것이다.
	ORCLJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	
	public MemberDAO() {
		// 데이터베이스 드라이버 로딩
		db = new ORCLJDBC();
		con = db.getCon();
		// MemberSQL 초기화
		mSQL = new MemberSQL();
	}
	
	// 회원가입 데이터베이스 처리 전담 함수
	public int addMember(MemberVO vo) {
		int cnt = 0;// 반환값 변수 만들고
		// 이 작업은 VO에 담긴 내용을 꺼내서 질의명령에 채워서 보내면 된다.
		// 따라서 PreparedStatement가 필요할 것이다.
		
		// 먼저 필요한 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		// PreparedStatement 가져오고
		pstmt = db.getPSTMT(sql);
		
		try{
			// 이제 질의 명령에 필요한 데이터 채우고
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getMail());
			pstmt.setString(5, vo.getGen());
			pstmt.setString(6, vo.getTel());
			pstmt.setInt(7, vo.getAno());
			
			// 질의 명령이 완성이 되었으니 보내고 변경된 행 수를 반환받으면 된다.
			cnt = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}

}
