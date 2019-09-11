package com.test.learning.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.learning.Teacher;
import com.test.learning.entities.ChemistryTeacher;

public class TeacherDaoImpl implements TeacherDao{
    private static Map<ChemistryTeacher,Integer> teacherMap=new HashMap<>();
    static {
    	teacherMap.put(new ChemistryTeacher(1,"Pramod"), 15000);
    	teacherMap.put(new ChemistryTeacher(3,"Avantika"), 25000);
    	teacherMap.put(new ChemistryTeacher(4,"Kaushik"), 9000);
    	teacherMap.put(new ChemistryTeacher(3,"Neha"), 35000);
    }
	@Override
	public List<ChemistryTeacher> findAllTeachers() {
		return new ArrayList<ChemistryTeacher>(teacherMap.keySet());
	}

	@Override
	public Integer findSalaryOfTeacher(ChemistryTeacher teacher) {
		// TODO Auto-generated method stub
		return teacherMap.get(teacher);
	}

	@Override
	public void deleteTeacher(ChemistryTeacher teacher) {
		teacherMap.remove(teacher);
		
	}

	@Override
	public void updateTeacher(ChemistryTeacher teacher) {
		teacherMap.put((ChemistryTeacher)teacher,33000);
		
	}

	@Override
	public void addTeacher(ChemistryTeacher teacher) {
		// TODO Auto-generated method stub
		teacherMap.put((ChemistryTeacher)teacher,33000);
	}

}
