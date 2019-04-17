package pro.pi;

import java.util.Scanner;

import pro.bean.Departmentss;
import pro.bean.Emploeessss;
import pro.dao.DepDaoo;

public class DepView {
	
	Emploeessss  obj ;
	Departmentss dep ;
	Scanner sc =new Scanner(System.in);
	DepDaoo dd= new  DepDaoo();
		
	
	
	
		public void inputFromUserDepartment() {
	
		
		try {
		System.out.println("department Name:- ");
		String departName= sc.next();
		System.out.println("manager ID:- ");
		int managerID= sc.nextInt();
		dep = new Departmentss(departName,managerID);
		dd.insertRecorddep(dep);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}	
		public void updatedep1() {
			Departmentss  obj= new Departmentss();
			System.out.println("Enter the departmentID whose details needs to be updated:- ");
			int employee= sc.nextInt();
			obj.setRow(employee); 
			
			
			System.out.println("Enter the coloumn you want to update:- ");
			System.out.println("1.Department Name");
			System.out.println("2.ManagerID");
			
			String a = sc.next();
			obj.setColoumn(a);
			

			switch(a) {
			case "departName": 
					System.out.println("Enter the string:- ");
					String s = sc.next();
					obj.setWord(s);
				break;
			case "managerID": 
					System.out.println("Enter the number:- ");
					int s1 = sc.nextInt();
					obj.setNumb(s1);
				break;
			default:
				System.out.println("Invalid Input");
		
		}
		
		dd.updateDep(obj);
		
	}
		public void deletecontent()
		{
			Departmentss  obj= new Departmentss();
			System.out.println("Enter the DepartmentID that needs to be deleted:- ");
			int employee= sc.nextInt();
			
			obj.setRow(employee); 
			
			dd.deleteDep(obj);
			
		}
		
		
		

}





