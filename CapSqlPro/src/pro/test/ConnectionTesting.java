package pro.test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertNotNull;

//import static org.junit.Assert.assertNotNull;
import java.sql.Connection;
//import java.sql.DriverManager;
//import org.junit.jupiter.api.Before;
import java.sql.DriverManager;

public class ConnectionTesting{
static Connection con;	
	
	@BeforeAll
	public static void beforeall() {
		con=null;
		System.out.println("BeforeALL");
		
	}
	
	@AfterAll
	public static void afterall() {
		con = null;
		System.out.println("AfterALL");
		
	}
	
	@AfterEach
	public void aftereach() {
	
		System.out.println("AfterEach");
		
	}
	
	@BeforeEach
	public void beforeeach() {
		
		System.out.println("BeforeEach");
		
	}
	@Test
	public void checkingValueTest(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			assertNotNull(con);
			System.out.println(con);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}