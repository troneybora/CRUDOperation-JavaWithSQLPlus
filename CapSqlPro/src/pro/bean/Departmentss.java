package pro.bean;


public class Departmentss {
	private int departmentID;
	private String departName;
	private int managerID;
	private String coloumn;
	private int row;
	private String word;
	private int numb;
	
	public int getNumb() {
		return numb;
	}

	public void setNumb(int numb) {
		this.numb = numb;
	}

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

	public Departmentss(){
		departName = "HR";
		managerID = 1;
		
	}
	
	public Departmentss(String departName,int managerID ){
		this.departName = departName;
		this.managerID = managerID;
		
	}
	
	

	public int getDepartmentID() {
		return departmentID;
	}


	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}


	public String getDepartName() {
		return departName;
	}


	public void setDepartName(String departName) {
		this.departName = departName;
	}


	public int getManagerID() {
		return managerID;
	}


	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Printing Department Details \n");
		sb.append("Department Id: " +departmentID +"\n");
		sb.append("Department Name: "+ departName +"\n");
		sb.append("Manager ID: "+ managerID);
		return sb.toString();
	}
}
