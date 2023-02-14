/*
 * 06-12-2021
 * Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'printSalaryegg' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same. (Exercise to understand inheritance)
 */
package mod2;
import java.util.Scanner;
class Employee
{
	String name,age,phnum,add,salary;
	void printsalary()
	{
		System.out.println(" Salary : "+salary);
	}
	void display()
	{
		System.out.println(" Name : "+name);
		System.out.println(" age : "+age);
		System.out.println(" phone number : "+phnum);
		System.out.println(" Address : "+add);
	}
}

class officer extends Employee
{
	String specialization;
}
class manager extends Employee
{
	String department;
}

public class P11_Employee {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		officer off=new officer();
		manager ma=new manager();
		
		System.out.print("Name of officer : ");
		off.name=in.nextLine();
		System.out.print(" age of officer : ");
		off.age=in.nextLine();
		System.out.print(" phone number of officer : ");
		off.phnum=in.nextLine();
		System.out.print(" address of officer : ");
		off.add=in.nextLine();
		System.out.print(" salary of officer : ");
		off.salary=in.nextLine();
		System.out.print(" specialization of officer : ");
		off.specialization=in.nextLine();
		
		System.out.print("\nName of Manager : ");
		ma.name=in.nextLine();
		System.out.print(" age of Manager : ");
		ma.age=in.nextLine();
		System.out.print(" phone number of Manager : ");
		ma.phnum=in.nextLine();
		System.out.print(" address of Manager : ");
		ma.add=in.nextLine();
		System.out.print(" salary of Manager : ");
		ma.salary=in.nextLine();
		System.out.print(" department of manager : ");
		ma.department=in.nextLine();

		System.out.println("\nDETAILS OF OFFICER");
		off.display();
		off.printsalary();
		System.out.println(" specialization of officer : "+off.specialization);
		
		System.out.println("\nDETAILS OF MANAGER");
		ma.display();
		ma.printsalary();
		System.out.println(" department  of manager : "+ma.department);
	}
}

/*
 * OUTPUT:
 * 
 * Name of officer : Samuel
 age of officer : 36
 phone number of officer : 92892839
 address of officer : Pala
 salary of officer : 92,300
 specialization of officer : MBA

Name of Manager : Tony
 age of Manager : 40
 phone number of Manager : 43932839
 address of Manager : Dallas
 salary of Manager : 1,02,300
 department of manager : IT

DETAILS OF OFFICER
 Name : Samuel
 age : 36
 phone number : 92892839
 Address : Pala
 Salary : 92,300
 specialization of officer : MBA

DETAILS OF MANAGER
 Name : Tony
 age : 40
 phone number : 43932839
 Address : Dallas
 Salary : 1,02,300
 department  of manager : IT

 */
