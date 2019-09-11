package com.test.learning;

import com.test.learning.entities.ChemistryTeacher;
import com.test.learning.entities.MathsTeacher;

public class TeacherFactory {
	//private static final String CHEMISTRY="CHEMISTRY";
	//private static final String MATHS="MATHS";
	//private static final String PHYSICS="PHYSICS";
	private  static TeacherFactory INSTANCE;
	private TeacherFactory() {
		
	}
	
	public static TeacherFactory getTeacherFactory() {
		if(INSTANCE==null) {
			INSTANCE=new TeacherFactory();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	public static Teacher getTeacher(String topic) {
		if (topic.equals(TeacherEnum.CHEMISTRY.getTopic())) {
			return new ChemistryTeacher(1,"Rohan");
		}else if(topic.equals(TeacherEnum.MATHS.getTopic())){
			return new MathsTeacher(2,"Pari");
		}
		return null;
	}
}
