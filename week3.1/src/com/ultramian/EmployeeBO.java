package com.ultramian;
import java.sql.SQLException;
import java.util.Scanner;

import com.ultramian.EmpDao;
import com.ultramian.EmpDto;
import com.ultramian.Scan;


public class EmployeeBO {
	public void empSystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmpDao dao = new EmpDao();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		}while(choice ==0);
		
		switch(choice){
		case 1:
			viewEmployees(dao);
			break;
		case 2:
			registerEmployee(dao);
			break;
		case 3:
			return;
		}
	}
	
	public void viewEmployees(EmpDao dao){
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void registerEmployee(EmpDao dao){
		EmpDto empDto = getEmpDetails();
		try {
			dao.registerEmployee(empDto);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private EmpDto getEmpDetails(){
		Scanner scan = Scan.getScannerInstance();
		EmpDto empDto = new EmpDto();
		System.out.println("Enter Employee Id: ");
		empDto.setEmployeeId(scan.nextInt());
		System.out.println("Enter First Name : ");
		empDto.setFirstName(scan.next());
		System.out.println("Enter Last Name : ");
		empDto.setLastName(scan.next());
		System.out.println("Enter Salary : ");
		empDto.setSalary(scan.nextFloat());
		System.out.println("Enter Mobile : ");
		empDto.setMobile(scan.nextInt());
		System.out.println("Enter Department : ");
		empDto.setDepartment(scan.next());		
		return empDto;
		
	}

}
