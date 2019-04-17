package pro.dao;
import pro.pi.*;
import pro.service.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import pro.bean.*;

public class empdaoo {
	
	Connection con;
	
	public empdaoo(){
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		}
		catch(Exception e) 
		{
			
			System.out.println("Connection not established");
		}
	}
	Scanner sc= new Scanner(System.in);
	public void insertRecordemp(Emploeessss obj) throws Exception{
		
		
		
		PreparedStatement stmt = con.prepareStatement(QueryMapper.INSERT_QUERY_EMP);
		String firstName = obj.getFirstName();
		stmt.setString(1,firstName );
		String lastName=obj.getLastName();
		stmt.setString(2,lastName );
		String email=obj.getEmail();
		stmt.setString(3,email );
		int phoneNumber=obj.getPhoneNumber();
		stmt.setInt(4,phoneNumber );
		String hireDate=obj.getHireDate();
		stmt.setString(5,hireDate );
		String designation=obj.getDesignation();
		stmt.setString(6,designation );
		double salary= obj.getSalary();
		stmt.setDouble(7,salary );
		int managerID= obj.getManagerID();
		stmt.setInt(8,managerID);
		int departmentID=obj.getDepartmentID();
		stmt.setInt(9,departmentID );
	
		int i=stmt.executeUpdate();
		
		
		System.out.println(i+" Records inserted");
		
		
	}
	
	
	
	public void updateEmp(Emploeessss emp1) {
		
		
		try {	
		
		String x = emp1.getColoumn();
		 System.out.println(x);
		int y = emp1.getRow();
		System.out.println(y);
		String z = emp1.getWord();
		System.out.println(z);
		int f = emp1.getNumb();
		System.out.println(f);
		
	
		PreparedStatement obj1 = con.prepareStatement("update employeess SET " + x + "= ? where employeeID = ?");
		

		if(z==null) {
			
	    	obj1.setInt(1,f );
		}
		else {

	      	obj1.setString(1, z);
		}
	   
	    
	    obj1.setInt(2,y);
	    
	    obj1.executeUpdate();
	    
	    System.out.println(" Updation done");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		 
				 
				
	}


	public void deleteEmploy(Emploeessss es) {
		try {
			
		
		int s= es.getRow();
		PreparedStatement stmt=con.prepareStatement(QueryMapper.delete_QUERY_EMP);
		System.out.println(s);
		stmt.setInt(1,s);
		
		int i=stmt.executeUpdate();
		System.out.println(i+"record deleted");
		con.close();
		}catch(Exception e) {
			
			System.out.println(e);
		}	
	}
	
	public void Displayplay(Emploeessss em) {
		try{
			
			int d= em.getNumb();
			
			Statement st = con.createStatement();
			
			String q="SELECT * FROM employeess,Department where employeess.employeeID = department.departmentID AND employeess.employeeID = " + d ;
			//System.out.println(q);;
			  st.executeQuery(q);
			  
			  ResultSet rs = st.getResultSet();
			  
			  while(rs.next())
			  {
				  System.out.print(rs.getInt("EmployeeID")+" ");
				  System.out.print(rs.getString("firstName")+ " ");
				  System.out.print(rs.getString("lastName")+ " ");
				  System.out.print(rs.getString("email")+ " ");
				  System.out.print(rs.getInt("phoneNumber")+ " ");
				  System.out.print(rs.getDate("hireDate")+ " ");
				  System.out.print(rs.getString("designation")+ " ");
				  System.out.print(rs.getInt("salary")+ " ");
				  System.out.print(rs.getInt("managerID")+ " ");
				  System.out.print(rs.getInt("departmentID")+ " ");
				  System.out.print(rs.getString("departName")+ "\n");
				 
				  }
			  
		
			}
	          catch(Exception e) {
	        	  System.out.println(e);
	          	}
	}	
	
	
	public void meds(Emploeessss f) {
		Emploeessss em = new Emploeessss();
		 MedicalSceme ms = new MedicalSceme();
		EmpView ev = new EmpView();
		
		try {
		int employee= f.getEmployeeId();
		double c;
		
		Statement st = con.createStatement();
		
		String q="SELECT * FROM employeess where employeeID =" +employee;
		
		  st.executeQuery(q);
		  
		  ResultSet rs = st.getResultSet();
		  		  
		  if(rs.isBeforeFirst()) //Data Exists
		  { 
		    
			  
		  while (rs.next()) {
			
			System.out.print("Employee details of EmployeeID= " + employee+"\n");
			  System.out.print(rs.getInt("EmployeeID")+" ");
			  System.out.print(rs.getString("firstName")+ " ");
			  System.out.print(rs.getInt("salary")+ " ");
			  System.out.print(rs.getString("designation")+ "\n");
			  c=rs.getInt("salary");
			  em.setSalary(c);
			  ms.chekingScheme(em);
			  
			  }
		  
		  }
		  
		  else {
			  
			
			 
				ms.scemess();
		  
	}
		 
		  
		  
		}
		catch(Exception e)
		{
			
		}
	}
}
