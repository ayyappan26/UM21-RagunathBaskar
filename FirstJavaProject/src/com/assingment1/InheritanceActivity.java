package com.assingment1;
class Employee{
	long employeeid,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80,Hra=1000.50;
	public Employee(long id,String Name,String address,long phone){
		this.employeeid=id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		System.out.println(employeeid);
		System.out.println(employeeName);
		System.out.println(employeeAddress);
		System.out.println(employeePhone);
	}
	 public void calculateSalary(){
			basicSalary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
			System.out.println(basicSalary);
		
}
	 public void calculateTransportAllowance(){
			double transportAllowance;
			transportAllowance=10*basicSalary/100;
			System.out.println(transportAllowance);
		}
}
class Manager extends Employee{
	double Salary;
	 public Manager(long id,String Name,String address,long phone,double Salary){
		super(id,Name,address,phone);
		this.basicSalary=Salary;
	}
	 public void calculateTransportAllowance(){
			double transportAllowance;
			transportAllowance=15*basicSalary/100;
			System.out.println(transportAllowance);
		}
}
class Trainee extends Employee{
	double Salary;
	public Trainee(long id,String Name,String address,long phone,double Salary){
		super(id,Name,address,phone);
		this.basicSalary=Salary;
	}
}

public class InheritanceActivity {
	public static void main(String args[]){
		Manager mymanager1=new Manager(126534,"Peter","Chennai India",237844,65000);
		mymanager1.calculateSalary();
		mymanager1.calculateTransportAllowance();
		Trainee myTrainee2=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		myTrainee2.calculateSalary();
		myTrainee2.calculateTransportAllowance();
		System.out.println("hi..");
		
	}

}
