package com.test.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {
		
		List<Employee> lstEmployee=new ArrayList<>();
		Employee emp1=new Employee(1, "Avnish", "Sha", "DBS");
		Employee emp2=new Employee(10, "Pramod", "Singh", "OFFICE DEPOT");
		Employee emp3=new Employee(9, "Narendra", "Modi", "TMT");
		Employee emp4=new Employee(5, "Rohit", "Rai", "RCL");
		
		IdComparator comparator=new IdComparator();
		
		List<String> lstStr= Arrays.asList("Avinash","Pramod","Narendra","Rohit");
		lstEmployee.add(emp1);
		lstEmployee.add(emp2);
		lstEmployee.add(emp3);
		lstEmployee.add(emp4);
		Collections.sort(lstStr);
		for(String str:lstStr) {
			System.out.println("Sorted Name:"+str);
		}
		System.out.println("Employees Sorting using Comparable----------------");
		Collections.sort(lstEmployee);
		for(Employee emp:lstEmployee) {
			System.out.println("Sorted Name:"+emp.getfName());
		}
		System.out.println("Employees Sorting using Compartor----------------");
		Collections.sort(lstEmployee,comparator);
		for(Employee emp:lstEmployee) {
			System.out.println("Sorted Id:"+emp.getId());
		}
	}

}
