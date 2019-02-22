package practice13.common;

public class Employee extends Person {
	String departmentNm;
	int departmentCnt;

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public String getDepartmentNm() {
		return departmentNm;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
	public int getdepartmentCnt() {
		return departmentCnt;
	}

	public Employee(String departmentNm, int departmentCnt) {
		this.departmentNm = departmentNm;
		this.departmentCnt = departmentCnt;
	}

}
