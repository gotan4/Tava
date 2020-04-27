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

import javax.swing.JOptionPane;

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
		// MemberSQL 초기화
		mSQL = new MemberSQL();
	}
	
	// 회원가입 데이터베이스 처리 전담 함수
	public int addMember(MemberVO vo) {
		// 커넥션 얻어오고
		con = db.getCon();
		int cnt = 0;// 반환값 변수 만들고
		// 이 작업은 VO에 담긴 내용을 꺼내서 질의명령에 채워서 보내면 된다.
		// 따라서 PreparedStatement가 필요할 것이다.
		
		// 먼저 필요한 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		// PreparedStatement 가져오고
		pstmt = db.getPSTMT(con, sql);
		
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
	
	// 회원번호로 회원정보 조회 전담 처리함수
	public MemberVO getMembInfo(int mno) {
		/*
			이 함수는 회원정보를 입력받아 회원정보를 조회할 전담 처리함수이다.
			함수가 호출되면 회원정보 데이터를 VO에 담아서 반화해주도록 하자.
		 */
		// 0. 반환데이터 변수 만들고
		MemberVO mVO = new MemberVO();
		// 1. 커넥션 얻어오고
		con = db.getCon();
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_MNO);
		// 3. PreparedStatement 가져오고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setInt(1, mno);
			// 5. 질의명령 보내고 결과 받고 - 결과는 한행이 나올것이다.
			rs = pstmt.executeQuery();
			
			// 작업줄 내리고
			rs.next();
			// 6. ResultSet에 담긴 내용 VO에 채워주고
			mVO.setMno(rs.getInt("mno"));
			mVO.setName(rs.getString("name"));
			mVO.setId(rs.getString("id"));
			mVO.setMail(rs.getString("mail"));
			mVO.setTel(rs.getString("tel"));
			mVO.setGen(rs.getString("gen"));
			mVO.setAno(rs.getInt("ano"));
			// JDBC 는 데이터베이스의 날짜 데이터를 날짜와 시간을 가져오는 함수가 따로 구현되어 있다.
			mVO.setJoinDate(rs.getDate("joinDate"));
			mVO.setJoinTime(rs.getTime("joinDate"));
			// 날짜데이터를 문자로 바꾸고
			mVO.setsDate();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 7. 데이터는 채워졌으니 반환해주자.
		return mVO;
	}
	
	// 회원리스트 가져오기 디비작업 전담 처리 함수
	public ArrayList<MemberVO> getAllList(){
		// 회원리스트 반환값 변수 선언
		ArrayList<MemberVO> mList = new ArrayList<MemberVO>();
		
		// 커넥션 가져오고
		con = db.getCon();
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ALL);
		// Satatement가져오고
		stmt = db.getSTMT(con);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			// 몇개의 데이터가 조회되었는지 알수 없으므로 반복해서 처리한댜.
			while(rs.next()) {
				// 반복될때마다 한명의 데이터가 생겨야 되므로 VO를 반복할때마다 만들어준다.
				MemberVO mVO = new MemberVO();
				// ResultSet에 담긴 데이터 VO에 채우고
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setJoinDate(rs.getDate("joinDate"));
				mVO.setJoinTime(rs.getTime("joinDate"));
				mVO.setsDate();
				
				// 필요한 데이터 모두 채웠으니 리스트에 담고
				mList.add(mVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		Collections.sort(mList, new Comparator<MemberVO> (){

			@Override
			public int compare(MemberVO m1, MemberVO m2) {
				return m1.getMno() - m2.getMno();
			}
		});
		
		return mList;
	}
	
	// 회원가입 디비 전담 처리함수
	public int insertMemb(MemberVO mVO) {
		// 반환값 변수선언
		int cnt = 0 ;
		// 커넥션 가져오고
		con = db.getCon();
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.INSERT_MEMB);
		// PreparedStatement 가져오고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 질의명령 완성하고
			pstmt.setString(1, mVO.getName());
			pstmt.setString(2, mVO.getId());
			pstmt.setString(3, mVO.getPw());
			pstmt.setString(4, mVO.getMail());
			pstmt.setString(5, mVO.getGen());
			pstmt.setString(6, mVO.getTel());
			pstmt.setString(7, mVO.getAvatar());
			
			// 질의명령 보내고 결과 받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(stmt);
			db.close(con);
		}
		
		// 반환값 넘겨주고
		return cnt;
	}

}
