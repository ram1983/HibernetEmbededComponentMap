package com.app.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_detail")
public class Employee {

	@Id
	@Column(name = "eid")
	private int empId;

	@Column(name = "ename")
	private String empname;

	@Column(name = "esal")
	private double empSal;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column=@Column(name="earea"),name="area"),
		@AttributeOverride(column=@Column(name="ehouseno"),name="hono")
	})
	private Address addr;

	public Employee() {
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSal=" + empSal + ", addr=" + addr + "]";
	}

}
