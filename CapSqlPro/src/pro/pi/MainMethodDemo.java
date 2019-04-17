package pro.pi;
import pro.dao.*;
import pro.bean.*;
import pro.service.*;

import java.util.Scanner;

public class MainMethodDemo {

	public static void main(String[] args) {
		
		EmpView ev =new EmpView();
		DepView dv =new DepView();
		empdaoo ed = new empdaoo();
		DepDaoo dd= new  DepDaoo();
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{ 
		System.out.println("Select your options:- ");
		System.out.println("1.Insert New Employee Record");
		System.out.println("2.Insert New Department Record");
		System.out.println("3.Update a Employee Record");
		System.out.println("4.Update a Department Record");
		System.out.println("5.Delete a Employee Record");
		System.out.println("6.Delete a Department Record");
		System.out.println("7.Display Employee Record");
		System.out.println("8.Display Department Record");
		System.out.println("9.Display the medical Insurance scheme applicable");
		System.out.println("10.Exit");
		
		
		int a = sc.nextInt();
		switch(a) {
		case 1: ev.inputFromUserEmployee();
			break;
		case 2:  dv.inputFromUserDepartment();
			break;
		case 3: ev.updateemp1();
			break;
		case 4: dv.updatedep1();
			break;
		case 5:  ev.deletecontent(); 
			break;
		case 6: dv.deletecontent();
			break;
		case 7:  ev.fetchsss();
			break;
		case 8:  dd.Displayplay1();
			break;
		case 9:   ev.medsss();
			break;
		case 10: System.exit(0);  
			break;
			
		default:
			System.out.println("Invalid input");
				break;
		}
		
		
		}
		
	}

}
