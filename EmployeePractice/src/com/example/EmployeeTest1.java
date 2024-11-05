package com.example;

import com.example.domain.*;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0]= new Employee("Sean","A123456789",50000);
		emps[1]= new Admin("Amy","R210987654",80000);		
		emps[2]=new Engineer("David","C109876543",80000);
		emps[3]=new Manager("Louis","D124680135",100000,"TW Sales");
		emps[4]=new Director("Nicole","R202468135",120000,"Global Sales",1000000);
		for(int i=0 ; i<emps.length;i++)
			emps[i].dispalyInformation();
		
		System.out.println("\nDavid學會Java,加薪 5000元");
		if(emps[2] instanceof Engineer) {
			((Engineer)emps[2]).addskill("Java");
			((Engineer)emps[2]).addskill("Android");
		}
		
		emps[2].raiseSalary(5000);
		System.out.println("部門分配\n.....");
		if(emps[3] instanceof Manager) {
			Manager m1=(Manager)emps[3];
			m1.addEmployee(emps[0]);
			m1.addEmployee(emps[1]);
			m1.addEmployee(emps[2]);
		}
		if(emps[4] instanceof Manager)
			((Manager)emps[4]).addEmployee(emps[3]);
		for(int i=0 ; i<emps.length;i++)
			emps[i].dispalyInformation();
		
	}

}
