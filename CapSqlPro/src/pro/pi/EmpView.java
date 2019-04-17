package pro.pi;


import java.util.Scanner;

import pro.bean.*;
import pro.dao.empdaoo;
public class EmpView {
	

	empdaoo edao = new empdaoo();
	Scanner sc =new Scanner(System.in);
	
	public void inputFromUserEmployee() {
		Emploeessss  obj;
		try {
		System.out.println("first Name:- ");
		String firstName = sc.next();	
		System.out.println("last Name:- ");
		String lastName=sc.next();
		System.out.println("email:- ");
		String email=sc.next();
		System.out.println("phone Number:- ");
		int phoneNumber=sc.nextInt();
		System.out.println("hire Date:- ");
		String hireDate=sc.next();
		System.out.println("designation:- ");
		String designation=sc.next();
		System.out.println("salary:- ");
		double salary=sc.nextDouble();
		System.out.println("managerID:- ");
		int managerID=sc.nextInt();
		System.out.println("departmentID:- ");
		int departmentID=sc.nextInt();
		
		obj =new Emploeessss(firstName,lastName,email,phoneNumber,hireDate,designation,salary,managerID, departmentID);
		
			edao.insertRecordemp(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void updateemp1() {
		Emploeessss  obj= new Emploeessss();
		System.out.println("Enter the employeeID whose details needs to be updated:- ");
		int employee= sc.nextInt();
		obj.setRow(employee); 
		
		
		System.out.println("Enter the coloumn you want to update:- ");
		System.out.println("1.First Name");
		System.out.println("2.Last Name");
		System.out.println("3.Email");
		System.out.println("4.Phone Number");
		System.out.println("5.Hire Date");
		System.out.println("6.Designation");
		System.out.println("7.Salary");
		System.out.println("8.Manager ID");
		System.out.println("9.Department ID");
		String a = sc.next();
		obj.setColoumn(a);
		

		switch(a) {
		case "firstName": 
				System.out.println("Enter the string:- ");
				String s = sc.next();
				obj.setWord(s);
			break;
		case "lastName": 
				System.out.println("Enter the string:- ");
				String s1 = sc.next();
				obj.setWord(s1);
			break;
		case "email": 
				System.out.println("Enter the string:- ");
				String s2 = sc.next();
				obj.setWord(s2);
			break;
		case "phoneNumber":	
				System.out.println("Enter the number:- ");
				int i = sc.nextInt();
				obj.setNumb(i);
			break;
		case "hireDate":	
				System.out.println("Enter the string:- ");
				String s3 = sc.next();
				obj.setWord(s3);
			break;
		case "designation":
				System.out.println("Enter the string:- ");
				String s4 = sc.next();
				obj.setWord(s4);
			break;
		case "salary":	
				System.out.println("Enter the number:- ");
				int i2 = sc.nextInt();
				obj.setNumb(i2);
			break;
		case "managerID":	
				System.out.println("Enter the number:- ");
				int i3 = sc.nextInt();
				obj.setNumb(i3);
			break;
		case "departmentID":	
				System.out.println("Enter the number:- ");
				int i4 = sc.nextInt();
				obj.setNumb(i4);
			break;
			
			
			default:
				System.out.println("Invalid Input");
		
		}
		
		edao.updateEmp(obj);
		
	}
	
	public void deletecontent()
	{
		Emploeessss  obj= new Emploeessss();
		System.out.println("Enter the employeeID that needs to be deleted:- ");
		int employee= sc.nextInt();
		
		obj.setRow(employee); 
		
		edao.deleteEmploy(obj);
		
	}
	
	public void fetchsss()
	{
		
		Emploeessss  obj= new Emploeessss();
		System.out.println("Enter the employeeID:- ");
		int id= sc.nextInt();
		
		
		
		obj.setNumb(id);
		
		edao.Displayplay(obj);
		
	}
	
	
	public void medsss() {
		Emploeessss  obj= new Emploeessss();
		System.out.println("Enter the employeeID for scheme:- ");
		int employee= sc.nextInt();
		obj.setEmployeeId(employee);
		edao.meds(obj);
		
		
		
		
	}
	
	
	
}
