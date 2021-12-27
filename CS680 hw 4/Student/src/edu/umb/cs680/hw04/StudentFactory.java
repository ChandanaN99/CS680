package edu.umb.cs680.hw04;

public class StudentFactory {
	
	private StudentFactory() {}
	
	public static Student createInStateStudent(String name, String usAddress, int yearsInState) {
		return new Student(name, usAddress, yearsInState, 0, null, StudentStatus.INSTATE);
	}
	
	public static Student createOutStateStudent(String name, String usAddress, int yearsInState) {
		return new Student(name, usAddr, yearsInState, 0, null, StudentStatus.OUTSTATE);
	}
	
	public static Student createIntlStudent(String name, String usAddress, int i20number, String foreignAddress) {
		return new Student(name, usAddress, 0, i20number, foreignAddress, StudentStatus.INTL);
	}
	
	/*public static void main(String[] args) {
		Student s1 = createInStateStudent("Chandana" , "Dorchester", 22);
		System.out.println("Name of Student: " + s1.getName());
		System.out.println("Years in state: " + s1.getYearsInState());
		System.out.println("US address: " + s1.getUSAddr());
		System.out.println("I-20 number of the student: " + s1.geti20Number());
		System.out.println("Foreign Address: " + s1.getForeignAddress());
		System.out.println("Student status: " + s1.getStatus());
		
	}*/
}
