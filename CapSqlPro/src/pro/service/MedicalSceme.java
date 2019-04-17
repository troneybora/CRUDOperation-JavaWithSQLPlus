package pro.service;
import pro.pi.*;
import pro.bean.*;

@SuppressWarnings("serial")
class UserExcep extends RuntimeException{
	UserExcep(){
		System.out.println("EmployeeID not available");
	}
	UserExcep(String a){
		System.out.println("EmployeeID Exception :- " + a);
	}
}

public class MedicalSceme implements Medical {
	

	
	public void scemess() {
		// TODO Auto-generated method stub
		UserExcep ue = new UserExcep();
		
		try {
				throw new UserExcep("Try different ID");
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void chekingScheme(Emploeessss em) {
		
		double a = em.getSalary();
		
		System.out.println("\nEmployee Medical Insurance Scheme:- \n");
		
		if (a>=40000)
		{
			
			System.out.println("Insurance Scheme :- Scheme C ");
		}
		else if(a==35000) {
			
			System.out.println("Insurance Scheme :- Scheme B ");
		}
		else if(a==20000)
		{
			
			System.out.println("Insurance Scheme :- Scheme A ");
		}
		else {
			
			System.out.println("Insurance Scheme :- No Scheme");
		}
	}
}
