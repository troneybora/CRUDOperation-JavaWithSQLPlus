package pro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import pro.bean.Departmentss;

public class DepDaoo {
	
Connection con;
	
	public DepDaoo(){
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
	
	
	public void insertRecorddep(Departmentss obj) throws Exception{
		
		
	  
		PreparedStatement stmt = con.prepareStatement(QueryMapper.INSERT_QUERY_DEP);
		
		String departName= obj.getDepartName();
		stmt.setString(1,departName);
		int managerID= obj.getManagerID();
		stmt.setInt(2,managerID);
		
		int i = stmt.executeUpdate();
		System.out.println(i+" Records inserted");
		
	}
	
	public void updateDep(Departmentss sa) {
	try{
		String x = sa.getColoumn();
		 System.out.println(x);
		int y = sa.getRow();
		System.out.println(y);
		String z = sa.getWord();
		System.out.println(z);
		int f = sa.getNumb();
		System.out.println(f);
		
		PreparedStatement obj1 = con.prepareStatement("update department SET " + x + "= ? where departmentID = ?");
		
	 
	   
		if(z==null) {
	    	obj1.setInt(1, f);
		}
		else {
	      	obj1.setString(1, z);
		}
	   
	    
	    obj1.setInt(2,y);
	    
	    obj1.executeUpdate();
	    
	    System.out.println(" Updation done");

		
	}
	
	catch(Exception e){
		System.out.println(e);
	}
}
public void deleteDep(Departmentss d) {
	try {
		
		int s= d.getRow();
		PreparedStatement stmt=con.prepareStatement(QueryMapper.delete_QUERY_DEP);
		stmt.setInt(1,s);
		
		int i=stmt.executeUpdate();
		System.out.println(i+"record deleted");
		con.close();
		}catch(Exception e) {
			
			System.out.println(e);
		}	
		
	}
public void Displayplay1() {
	try{
		
		Statement st = con.createStatement();
		  st.executeQuery(QueryMapper.select_QUERY_DEP) ;
		  ResultSet rs = st.getResultSet();
		  
		  while(rs.next()) {
			  System.out.print(rs.getInt("departmentID")+" ");
			  System.out.print(rs.getString("departName")+ " ");
			  System.out.print(rs.getString("managerID")+ "\n");
			 
			  
			  
			   
		  }
	}
          catch(Exception e) {
        	System.out.println(e);  
          }
}

}
