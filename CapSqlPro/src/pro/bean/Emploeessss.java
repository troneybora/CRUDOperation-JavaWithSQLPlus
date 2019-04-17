package pro.bean;



public class Emploeessss {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private String hireDate;
	private String designation;
	private double salary;
	private int managerID;
	private int departmentID;
	private String coloumn;
	private int row;
	private String word;
	private int numb;
	public String getColoumn() {
		return coloumn;
	}





	public void setColoumn(String coloumn) {
		this.coloumn = coloumn;
	}





	public int getRow() {
		return row;
	}





	public void setRow(int row) {
		this.row = row;
	}





	public String getWord() {
		return word;
	}





	public void setWord(String word) {
		this.word = word;
	}





	public int getNumb() {
		return numb;
	}





	public void setNumb(int numb) {
		this.numb = numb;
	}


	
	
	public Emploeessss(){
		
		firstName = "Troney";
		lastName="Bora";
		email="Troney@yahoo.com";
		phoneNumber=975665649;
		designation="CEO";
		hireDate="12-Feb-2019";
		salary=80000.00;
		managerID=9;
		departmentID=3;
		//coloumn="dada";
		//row=2;
		//word="LALA";
		//numb=38999;
	}
	

	


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getHireDate() {
		return hireDate;
	}


	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}


	public Emploeessss(String firstName, String lastName, String email, int phoneNumber, String hireDate,
			String designation, double salary, int managerID, int departmentID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerID = managerID;
		this.departmentID = departmentID;
	}





	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getManagerID() {
		return managerID;
	}


	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}


	public int getDepartmentID() {
		return departmentID;
	}


	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}


	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Printing Employee Details \n");
		sb.append("Employee ID: " + employeeId +"\n");
		sb.append("First Name: " +firstName +" ");
		sb.append("Last Name: "+ lastName +"\n");
		sb.append("Email: "+ email +"\n");
		
		sb.append("Phone number: "+ phoneNumber +"\n");
		sb.append("Hire Date: "+ hireDate+"\n");
		sb.append("Designation: "+ designation +"\n");
		sb.append("Salary: "+ salary +"\n");
		sb.append("Manager ID: "+ managerID+"\n");
		sb.append("Department ID: "+ departmentID+"\n");
		sb.append("coloumn"+coloumn+"\n");
		sb.append("row"+row+"\n");
		sb.append("word"+word+"\n");
		sb.append("numb"+numb);
		
		return sb.toString();
	}
}
