package com.leave.management.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LeaveInterval {
    @Id
    @GeneratedValue
	private int id;
    private String startDate;
    private String endDate;
    private boolean isLeave;
    private int empId;
	public LeaveInterval() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveInterval(int id, String startDate, String endDate, boolean isLeave, int empId) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isLeave = isLeave;
		this.empId=empId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isLeave() {
		return isLeave;
	}
	public void setLeave(boolean isLeave) {
		this.isLeave = isLeave;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	@Override
	public String toString() {
		return "LeaveInterval [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", isLeave=" + isLeave
				+ ", empId="+empId+"]";
	}
    
    
}
