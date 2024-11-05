package com.example;

import com.example.domain.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1= new Employee("Sean","A123456789",50000);
		Employee emp2= new Employee("Amy","R210987654",80000);		
		emp1.dispalyInformation();
		emp2.dispalyInformation();
		System.out.println("Amy結婚並加薪");
		emp2.setName("Amy Smith");
		emp2.raiseSalary(1000);
		emp1.dispalyInformation();
		emp2.dispalyInformation();
		Admin emp3=new Admin("Amy","B210987654",70000);
		Engineer emp4=new Engineer("David","C109876543",80000);
		Manager emp5=new Manager("Louis","D124680135",100000,"TW Sales");
		Director emp6=new Director("Nicole","R202468135",120000,"Global Sales",1000000);
		emp3.dispalyInformation();
		emp4.dispalyInformation();
		emp5.dispalyInformation();
		emp6.dispalyInformation();
		
		System.out.println("\nDavid學會Java,加薪 5000元");
		emp4.addskill("Java");
		emp4.addskill("Android");
		emp4.raiseSalary(5000);
		emp4.dispalyInformation();
	}

}
