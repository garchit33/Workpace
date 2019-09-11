 package com.test.learning.entities;

import com.test.learning.Teacher;

public class MathsTeacher implements Teacher{
    private int id;
    private String name;
    public MathsTeacher(int id,String name) {
    	this.id=id;
    	this.name=name;
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
	@Override
	public String getTopic() {
		// TODO Auto-generated method stub
		return "Maths";
	}

}
