package com.example.domain;

public class Engineer extends Employee {
	private String[] skills;
	private int skillCount;

	public Engineer(String name, String ssn, double salary) {
		super(name, ssn, salary);
		this.skills =new String[5];
		this.skillCount=0;		
	}
	public void addskill(String skill) {
		if(skillCount<5) {
			skills[skillCount]=skill;
			skillCount++;
		}else
			System.out.println("最多註冊五種技能,新增失敗");
	}
	@Override
	public void dispalyInformation() {
		super.dispalyInformation();
		if(skillCount>0) {
			System.out.print("技能:");
			for(int i=0;i<skillCount;i++)
				System.out.printf("%s ", skills[i]);
			
				
		}
	}

	
	
}
