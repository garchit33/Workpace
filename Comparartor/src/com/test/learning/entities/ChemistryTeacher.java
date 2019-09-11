package com.test.learning.entities;

import com.test.learning.Teacher;

public class ChemistryTeacher implements Teacher{
	private int id;
	private String name;
	public ChemistryTeacher(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String getTopic() {
		// TODO Auto-generated method stub
		return "Chemistry";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		boolean result =false;
		if(obj !=null && obj instanceof ChemistryTeacher) {
			ChemistryTeacher teacher=(ChemistryTeacher)obj;
			if(this.getName().equals(teacher.getName())){
				result= true;
			}
		}
		return result;
	}
	public int hashCode() {
		return id*name.length();
	}

}
