/**
 * Lab5_4
 */
import java.util.Scanner;
class Employee{
	int employee_id;
	String employee_name;
	String designation;
	int age;
	double salary;

    Employee(){
        this.employee_id = 0;
        this.employee_name = "NULL";
        this.designation = "NULL";
        this.age = 0;
        this.salary = 0;
    }
	public void GetEmployeeDetails(){
		Scanner c = new Scanner(System.in);
		System.out.print("Enter Employee ID:");
		employee_id = c.nextInt();
		
		System.out.print("Enter Employee Name : ");
	    employee_name = c.next();
	    System.out.print("Enter Designation : ");
	    designation = c.nextLine();
	    System.out.print("Enter Employee Age : ");
	    age = c.nextInt();
	    System.out.print("Enter Employee Salary : ");
	    salary = c.nextDouble();
        c.close();

	}

	public void DisplayEmployeeDetails(){
		System.out.println();
		System.out.println("Employee ID : "+employee_id);
		System.out.println("Employee Name : "+employee_name);
		System.out.println("Designation : "+designation);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
}

public class Lab5_4 {
    public static void main(String[] args) {
		Employee e = new Employee();

		e.GetEmployeeDetails();
		e.DisplayEmployeeDetails();
        
	}
    
}
