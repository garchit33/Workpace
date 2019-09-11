package com.test.learning;

public enum TeacherEnum {
	CHEMISTRY(1,"CHEMISTRY"),PHYSICS(2,"PHYSICS"),MATHS(2,"MATHS");
	private int id;
	private String topic;
	
	TeacherEnum(){
		
	};
	TeacherEnum(int id,final String topic){
		this.id=id;
		this.topic=topic;
	}
	public int getId() {
		return id;
	}
	public final String getTopic() {
		return topic;
	}
}
