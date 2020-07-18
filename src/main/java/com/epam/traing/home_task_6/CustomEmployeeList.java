package com.epam.traing.home_task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomEmployeeList {

	List<Employee> custList  ;

	public CustomEmployeeList() {
		super();
		custList = new ArrayList<Employee>() ;
	}
	
	//Function to add a single employee.
	public void addEmployee(int id , String name , String designation , double salary) {
		custList.add(new Employee(id, name, designation, salary)) ;
		
	}
	
	//Function to add employee in bulk.
	public void addAllEmployee(int id[] , String name[] , String designation[] , double salary[]) {
		int size = id.length ;
		for(int  i = 0 ; i < size ; i++) {
			custList.add(new Employee(id[i], name[i], designation[i], salary[i])) ;
		}
	}
	
	//Function to get employee record based on employee id.
	public void getEmployee(int empid) {
		for(Employee e : custList) {
			if(e.getEmployeeId() == empid) {
				System.out.println("Details of employee ["+empid+"] : " + e);
			}
		}
	}
	
	//Function to remove an employee based on employee id.
	public void removeEmployee(int empid) {
		Iterator<Employee> itr = custList.iterator() ;
		while(itr.hasNext()) {
			if(itr.next().getEmployeeId() == empid)
			{
				System.out.println("Removing employee :" + itr.next());
				itr.remove();
			}
				
		}
	}
	
	//Function to display the list.
	public void printList() {
		for(Employee e : custList) {
			System.out.println(e);
		}	
	}	
}
