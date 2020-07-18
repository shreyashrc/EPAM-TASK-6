package com.epam.traing.home_task_6;

public class CustomListDemo {
	public static void main(String[] args) {
		
		//Creating custom Employee list
		CustomEmployeeList el = new CustomEmployeeList() ;
		
		//Adding single employee
		el.addEmployee(101, "Siddharth", "Software developer", 10000);
		
		int id[] = {102,103,104,105,106,107,108,109,110} ;
		String name[] = {"Aish" , "Rutik" , "Vishal","Rushi","Saumya","Honey","Dhruv","Ankush","Ansh"} ;
		String designation[] = {"Senior Developer","Junior Developer","Tech Support","Intern","Sales Executive","Marketing Executive","HR","Supporting Staff","Manager"} ;
		double salary[] = {50000,40000,35000,5000,30000,30000,50000,10000,15000} ;
		
		//Adding multiple employees 
		el.addAllEmployee(id, name, designation, salary);
		
		//Displaying Entire List
		System.out.println("Displaying all Employee records :");
		el.printList();
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//Fetching employee by Employee Id bases
		el.getEmployee(103);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//Removing an employee on Employee Id bases. 
		el.removeEmployee(104);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//Displaying List.
		System.out.println("Displaying all Employee records :");
		el.printList();
		
	}

}
