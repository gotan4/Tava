package MyProj.DAO;

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

import javax.swing.JOptionPane;

import MyProj.VO.*;
import MyProj.sql.*;
public class MemberDAO {
	// �� Ŭ������ �����ͺ��̽� ó���۾��� ���� Ŭ�����̹Ƿ� �⺻������ 
	// �����ͺ��̽� ����̹��ε��� ���� �۾��� 
	// �� Ŭ������ ��ü�� �Ǵ� ���� �̷�� ���°��� ���� ���̴�.
	ORCLJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	
	public MemberDAO() {
		// �����ͺ��̽� ����̹� �ε�
		db = new ORCLJDBC();
		// MemberSQL �ʱ�ȭ
		mSQL = new MemberSQL();
	}
	
	// ȸ������ �����ͺ��̽� ó�� ���� �Լ�
	public int addMember(MemberVO vo) {
		// Ŀ�ؼ� ������
		con = db.getCon();
		int cnt = 0;// ��ȯ�� ���� �����
		// �� �۾��� VO�� ��� ������ ������ ���Ǹ�ɿ� ä���� ������ �ȴ�.
		// ���� PreparedStatement�� �ʿ��� ���̴�.
		
		// ���� �ʿ��� ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		// PreparedStatement ��������
		pstmt = db.getPSTMT(con, sql);
		
		try{
			// ���� ���� ��ɿ� �ʿ��� ������ ä���
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getMail());
			pstmt.setString(5, vo.getGen());
			pstmt.setString(6, vo.getTel());
			pstmt.setInt(7, vo.getAno());
			
			// ���� ����� �ϼ��� �Ǿ����� ������ ����� �� ���� ��ȯ������ �ȴ�.
			cnt = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// ȸ����ȣ�� ȸ������ ��ȸ ���� ó���Լ�
	public MemberVO getMembInfo(int mno) {
		/*
			�� �Լ��� ȸ�������� �Է¹޾� ȸ�������� ��ȸ�� ���� ó���Լ��̴�.
			�Լ��� ȣ��Ǹ� ȸ������ �����͸� VO�� ��Ƽ� ��ȭ���ֵ��� ����.
		 */
		// 0. ��ȯ������ ���� �����
		MemberVO mVO = new MemberVO();
		// 1. Ŀ�ؼ� ������
		con = db.getCon();
		// 2. ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.SEL_MNO);
		// 3. PreparedStatement ��������
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. ���Ǹ�� �ϼ��ϰ�
			pstmt.setInt(1, mno);
			// 5. ���Ǹ�� ������ ��� �ް� - ����� ������ ���ð��̴�.
			rs = pstmt.executeQuery();
			
			// �۾��� ������
			rs.next();
			// 6. ResultSet�� ��� ���� VO�� ä���ְ�
			mVO.setMno(rs.getInt("mno"));
			mVO.setName(rs.getString("name"));
			mVO.setId(rs.getString("id"));
			mVO.setMail(rs.getString("mail"));
			mVO.setTel(rs.getString("tel"));
			mVO.setGen(rs.getString("gen"));
			mVO.setAno(rs.getInt("ano"));
			// JDBC �� �����ͺ��̽��� ��¥ �����͸� ��¥�� �ð��� �������� �Լ��� ���� �����Ǿ� �ִ�.
			mVO.setJoinDate(rs.getDate("joinDate"));
			mVO.setJoinTime(rs.getTime("joinDate"));
			// ��¥�����͸� ���ڷ� �ٲٰ�
			mVO.setsDate();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 7. �����ʹ� ä�������� ��ȯ������.
		return mVO;
	}
	
	// ȸ������Ʈ �������� ����۾� ���� ó�� �Լ�
	public ArrayList<MemberVO> getAllList(){
		// ȸ������Ʈ ��ȯ�� ���� ����
		ArrayList<MemberVO> mList = new ArrayList<MemberVO>();
		
		// Ŀ�ؼ� ��������
		con = db.getCon();
		// ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.SEL_ALL);
		// Satatement��������
		stmt = db.getSTMT(con);
		// ���Ǹ�� ������ ��� �ް�
		try {
			rs = stmt.executeQuery(sql);
			// ��� �����Ͱ� ��ȸ�Ǿ����� �˼� �����Ƿ� �ݺ��ؼ� ó���Ѵ�.
			while(rs.next()) {
				// �ݺ��ɶ����� �Ѹ��� �����Ͱ� ���ܾ� �ǹǷ� VO�� �ݺ��Ҷ����� ������ش�.
				MemberVO mVO = new MemberVO();
				// ResultSet�� ��� ������ VO�� ä���
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setJoinDate(rs.getDate("joinDate"));
				mVO.setJoinTime(rs.getTime("joinDate"));
				mVO.setsDate();
				
				// �ʿ��� ������ ��� ä������ ����Ʈ�� ���
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
	
	// ȸ������ ��� ���� ó���Լ�
	public int insertMemb(MemberVO mVO) {
		// ��ȯ�� ��������
		int cnt = 0 ;
		// Ŀ�ؼ� ��������
		con = db.getCon();
		// ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.INSERT_MEMB);
		// PreparedStatement ��������
		pstmt = db.getPSTMT(con, sql);
		try {
			// ���Ǹ�� �ϼ��ϰ�
			pstmt.setString(1, mVO.getName());
			pstmt.setString(2, mVO.getId());
			pstmt.setString(3, mVO.getPw());
			pstmt.setString(4, mVO.getMail());
			pstmt.setString(5, mVO.getGen());
			pstmt.setString(6, mVO.getTel());
			pstmt.setString(7, mVO.getAvatar());
			
			// ���Ǹ�� ������ ��� �ް�
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(stmt);
			db.close(con);
		}
		
		// ��ȯ�� �Ѱ��ְ�
		return cnt;
	}

}
