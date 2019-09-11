package com.test.learning;

import com.test.learning.entities.ChemistryTeacher;

public class PolymorphismTest {
	//private static final String CHEMISTRY="CHEMISTRY";
	//private static final String MATHS="MATHS";
	//private static final String PHYSICS="PHYSICS";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherFactory factory=TeacherFactory.getTeacherFactory();
		System.out.println("Hashcode factory:"+factory.hashCode());
		TeacherFactory factoryDoosara=TeacherFactory.getTeacherFactory(); 
		System.out.println("Hashcode factoryDoosara:"+factoryDoosara.hashCode());
		Teacher teacher=factory.getTeacher(TeacherEnum.CHEMISTRY.getTopic());
		System.out.println("Teacher's Topic:"+teacher.getTopic());
		ChemistryTeacher teacherChem=new ChemistryTeacher(1,"Rohan");
		ChemistryTeacher teacherChemDoosra=new ChemistryTeacher(2,"Rohan");
		System.out.println("Hashcode teacherChem:"+teacherChem.hashCode());
		System.out.println("Hashcode teacherChemDoosra:"+teacherChemDoosra.hashCode());
		
	}

}
