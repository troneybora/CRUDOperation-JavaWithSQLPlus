package pro.dao;

public interface QueryMapper {
	
	public static final String INSERT_QUERY_EMP="insert into employeess values (employeess_sequence.nextval,?,?,?,?,?,?,?,?,?)";
	
	public static final String INSERT_QUERY_DEP="insert into Department values (Department_sequence.nextval,?,?)";
	
	public static final String delete_QUERY_EMP="delete from employeess where EmployeeID = ? ";
	
	public static final String delete_QUERY_DEP="delete from Department where DepartmentID=?";
	
	public static final String select_QUERY_DEP="SELECT * FROM Department";
	
	
}
