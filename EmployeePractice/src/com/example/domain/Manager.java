package com.example.domain;

import java.util.ArrayList;

public class Manager extends Employee {
	private String deptName;
	private ArrayList employees;
	
	public Manager(String name, String ssn, double salary,String deptName) {
		super(name, ssn, salary);
		this.deptName=deptName;		
		employees=new ArrayList();
	}
	public String getDeptName() {
		return deptName;
	}

	public boolean addEmployee(Employee e) {
		if(employees.contains(e))
			return false;
		employees.add(e);
		return true;			
	}
	public boolean removeEmployee(Employee e) {
		if(!employees.contains(e))
			return false;
		employees.remove(e);
		return true;	
	}
	public void printStaffDetails() {
		if(!employees.isEmpty()) {
			System.out.printf("%s管理員工: ",this.getName());
			for(Object obj:employees) {
				if(obj instanceof Employee) {
					Employee e=(Employee)obj;
					System.out.printf("%s(%d)",e.getName(),e.getEmpId());					
				}	
			}
			System.out.println();
		}
	}
	@Override
	public void dispalyInformation() {
		super.dispalyInformation();
		System.out.println("部門:"+this.deptName);
		this.printStaffDetails();
	}

}
