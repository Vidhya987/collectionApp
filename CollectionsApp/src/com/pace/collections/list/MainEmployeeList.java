package com.pace.collections.list;
import java.util.ArrayList;
public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar=new Employee(121,"Kumar",10254.25f);
		Employee ram=new Employee(123,"Ram",75454.25f);
		Employee anthony=new Employee(124,"Anthony",36524.25f);
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(kumar);
		empList.add(ram);
		empList.add(anthony);
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		float totalSalary=0;
		for(Employee emp:empList) {
			totalSalary+=emp.getSalary();
		}
		System.out.println(totalSalary);
		}
	}


