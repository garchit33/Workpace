package com.test.learning;

import com.test.learning.dao.TeacherDao;
import com.test.learning.dao.TeacherDaoImpl;
import com.test.learning.entities.ChemistryTeacher;

public class TeacherDaoTest {

	public static void main(String[] args) {
		TeacherDao teacherDao=new TeacherDaoImpl();
		System.out.println("Find All Teachers--------------");
		for(ChemistryTeacher teacher:teacherDao.findAllTeachers()) {
			System.out.println("First Name:"+teacher.getName());
		}
		
		System.out.println("Find Teacher Salary--------------");
		Integer salary=teacherDao.findSalaryOfTeacher(new ChemistryTeacher(1,"Pramod"));
		System.out.println("Teacher's salary:"+salary);
		System.out.println("Delete Teacher--------------");
		teacherDao.deleteTeacher(new ChemistryTeacher(1,"Pramod"));
		System.out.println("Find All Teachers--------------");
		for(ChemistryTeacher teacher:teacherDao.findAllTeachers()) {
			System.out.println("First Name:"+teacher.getName());
		}
		
		System.out.println("Add Chemistry Teachers--------------");
		ChemistryTeacher chemistryTeacher1=new ChemistryTeacher(21,"Komal");
		teacherDao.addTeacher(chemistryTeacher1);
		for(ChemistryTeacher teacher:teacherDao.findAllTeachers()) {
			System.out.println("First Name:"+teacher.getName());
		}
	}

}
