package exam;

public class EmpDAO {
	public Chamgo eSql ;
	public EmpDAO() {
		eSql = new Chamgo();
		// 모든 회원의 정보를 조회할 질의명령 가져오기
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println("sql : " + sql);
	}

	public static void main(String[] args) {
		new EmpDAO();
	}

}
