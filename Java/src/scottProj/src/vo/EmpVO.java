package vo;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class EmpVO {
	private int empno,mgr,sal,comm,deptno;
	private String ename, job, sDate;
	private Date joinDate; // jdbc������ ���̺��̽��� ��¥�����͸� �����ö� ��¥�� �ð��� �и��ؼ� �����;� �Ѵ�.
	private Time joinTime;


	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getsDate() {
		return sDate;
	}
	public void setsDate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");
		String str = form1.format(joinDate) + " " + form2.format(joinTime);
		
		this.sDate = str;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Time getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
	}

	
}
