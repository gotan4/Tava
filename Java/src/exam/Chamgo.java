package exam;

/**
 * 		이 클래스는 emp 테이블의 사원 정보에 대한 질의 명령을 만들고
 * 		요청이 오면 반환해주는 클래스
 * @author	전은석
 * @since	2020.03.30
 * @version	v.1.0
 *
 */
public class Chamgo {
	// 코드를 담을 변수
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1002;
	
	public final int EDIT_SAL = 2001;
	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		// 모든 사원의 정보 가져오는 질의명령
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_DNO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			break;
		case EDIT_SAL:
			buff.append("UPDATE ");
			buff.append("	emp ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		}
		return buff.toString();
	}
}
