package com.example.domain;

import java.text.NumberFormat;

public class Employee {
 private static int nextId =101;
 private int empId;
 private String name="David";
 private String ssn="A123456789";
 private double salary=27490;
 NumberFormat formatter=NumberFormat.getCurrencyInstance();
 
 public Employee(String name,String ssn,double salary) {
	 this.empId=nextId++;
	 if(name!=null && name.trim().length()!=0)
	 this.name=name;
	 if(ssn!=null && ssn.trim().length()>0)
	 this.ssn=ssn;
	 if(salary>27490)
	 this.salary=salary;
 }
 public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	if(name!=null && name.length()!=0)
	this.name = name;
	else
		System.out.println("參數為空直改名失敗");
}
public String getSsn() {
	return ssn;
}
public double getSalary() {
	return salary;
}
public void raiseSalary(double increase) {
	if(increase>0)
		this.salary +=increase;
	else
		System.out.println("參數錯誤加薪失敗");
}

 
 
 public void dispalyInformation() {
	 
	 System.out.println("===========員工資訊==============");
	 System.out.println("編號:"+this.empId);
	 System.out.println("姓名:"+this.name);
	 System.out.println("SSN:"+this.ssn);
	 System.out.println("薪水:"+formatter.format(this.salary));
	 
 }
 
 
}
