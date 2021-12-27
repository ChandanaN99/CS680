package edu.umb.cs680.hw04;

enum StudentStatus{
	OUTSTATE(3000),INSTATE(300),INTL(3000);
	private float tution;
	StudentStatus(float n){
		this.tution = n;
	}
	public float getTution() {
		return this.tution;
	}	
	
}

public class Student {
	
	private float tution;
	private String usAddress;
	private int yearsInState;
	private String name;
	private int i20number;
	private String foreignAddress;
	private StudentStatus status;
	
	protected Student(String name, String usAddr, int years, int i20num, String foreignAddr, StudentStatus status) {
		this.name = name;
		this.usAddress = usAddress;
		this.yearsInState = years;
		this.i20number = i20number;
		this.foreignAddress = foreignAddress;
		this.status = status;
	}
	
	public float getTution() {
		return this.status.getTution();
	}
	
	public String getName() {
		return this.name;
	}
	
	public StudentStatus getStatus() {
		return this.status;
	}
	
	public int geti20Number() {
		return this.i20number;
	}
	
	public String getUSAddress() {
		return this.usAddress;
	}
	
	public String getForeignAddress() {
		return this.foreignAddress;
	}
	
	public int getYearsInState() {
		return this.yesrsInState;
	}
}
