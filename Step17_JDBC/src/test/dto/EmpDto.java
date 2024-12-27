package test.dto;

public class EmpDto {
	
	private int num;
	private String name;
	private int deptno;
	private int sal;
	
	public EmpDto() {}

	public EmpDto(int num, String name, int deptno, int sal) {
		this.num = num;
		this.name = name;
		this.deptno = deptno;
		this.sal = sal;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
