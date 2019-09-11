package com.test.learning.dao;

import java.util.List;

import com.test.learning.entities.ChemistryTeacher;

public interface TeacherDao {
	
	public List<ChemistryTeacher> findAllTeachers();
	public Integer findSalaryOfTeacher(ChemistryTeacher teacher);
	public void deleteTeacher(ChemistryTeacher teacher);
	public void updateTeacher(ChemistryTeacher teacher);
	public void addTeacher(ChemistryTeacher teacher);

}
