package MyProj.sql;

public class MemberSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_MNO = 1002;
	
	public final int ADD_MEMB = 3001;
	public final int INSERT_MEMB = 3002;
	
	// 코드를 입력하면서 호출하면 질의명령을 문자열로 반환해주는 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	mno, name, id, mail, gen, tel, ano, joinDate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			break;
		case SEL_MNO:
			buff.append("SELECT ");
			buff.append("	mno, name, id, mail, gen, tel, ano, joinDate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	AND mno = ? ");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member( ");
			buff.append("		mno, name, id, pw, mail, gen, tel, ano ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append(" (SELECT NVL(MAX(mno) + 1, 1000) FROM member WHERE mno <> 9999 ), ");
			buff.append(" ?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		case INSERT_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member( ");
			buff.append("		mno, name, id, pw, mail, gen, tel, ano ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append(" (SELECT NVL(MAX(mno) + 1, 1000) FROM member WHERE mno <> 9999 ), ");
			buff.append(" ?, ?, ?, ?, ?, ?, ");
			buff.append(" (SELECT ano FROM avatar WHERE savename = ?) ");
			buff.append(") ");
			break;
		}
		
		return buff.toString();
	}
}
