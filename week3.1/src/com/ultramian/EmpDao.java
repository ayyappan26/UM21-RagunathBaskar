package com.ultramian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.data.DataConnect;
import com.ultramian.EmpDto;


public class EmpDao {
	public void viewEmployees() throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String fName = "Diana";
		//String sqlQuery = "select first_name, salary from emp where first_name = '"+fName+"'";
	//	Statement st = con.createStatement();
		//ResultSet rs =  st.executeQuery(sqlQuery);
		String sqlQuery = "select first_name, salary from emp where first_name = ?";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1, fName);
		ResultSet rs = pst.executeQuery();
		
		int employee_id;
		String first_name;
		String last_name;
		float salary;
		int mobile;
		String department;
		
		while(rs.next()){
			//employee_id = rs.getInt("Employee_id");
			first_name = rs.getString(1);
			//last_name = rs.getString(3);
			salary = rs.getFloat(2);
			//mobile = rs.getInt(5);
			//department = rs.getString(6);
			
			//System.out.println("Employee_id : " + employee_id);
			System.out.println("First Name : " + first_name);
			//System.out.println("Last Name : " + last_name);
			System.out.println("Salary : " + salary);
			//System.out.println("Mobile : " + mobile);
			//System.out.println("Department : " +  department);
			//System.out.println("----------------------------------");
		}
	}

	public void registerEmployee(EmpDto empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
//		Statement st = con.createStatement();
//		String sql = "INSERT INTO emp VALUES ("+ 
//					empDto.getEmployeeId()+
//					",'"+empDto.getFirstName()+"'"+
//					",'"+empDto.getLastName()+"',"+
//					empDto.getSalary()+","+
//					empDto.getMobile()+
//					",'"+empDto.getDepartment()+"')";
//		int rowsUpdate = st.executeUpdate(sql);
//		System.out.println(rowsUpdate);
		
		String sql = "INSERT INTO emp VALUES (?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmployeeId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setFloat(4, empDto.getSalary());
		pst.setInt(5, empDto.getMobile());
		pst.setString(6, empDto.getDepartment());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated : " + rowsUpdated);
		
					
		
	}
}


