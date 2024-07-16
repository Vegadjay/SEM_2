import java.util.Scanner;
/**
 * Lab6_3
 */

class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(){
        name = "";
        age = 0;
        phoneNumber = "";
        address = "";
        salary = 0;
    }
        Member(String name, int age, String phoneNumber, String address, double salary) {
            this.name= name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
        }
        public double printSalary(){
            return this.salary;
        }

        public void printDetails(){
            System.out.println("Name : "+this.name);
            System.out.println("Age : "+this.age);
            System.out.println("Phone Number : "+this.phoneNumber);
            System.out.println("Address : "+this.address);
            System.out.println("Salary : "+this.printSalary());

        }

}
class Employee extends Member{
    String specializations;
    Employee(String name, int age, String phoneNumber, String address, double salary,String specializations){
            // this.name= name;
            // this.age = age;
            // this.phoneNumber = phoneNumber;
            // this.address = address;
            // this.salary = salary;
            super(name, age, phoneNumber, address, salary);
            this.specializations = specializations;

    }
    public void printDetails(){
        // System.out.println("Employee Name: "+this.name);
        // System.out.println("Employee Age: "+this.age);
        // System.out.println("Employee Mobile Number: "+this.phoneNumber);
        // System.out.println("Emploee Address: "+this.address);
        // System.out.println("Employee Salary: "+printSalary());
        super.printDetails();
        System.out.println("Specializations: "+this.specializations);

    }

}
class Manager extends Member{
    String department;
    Manager(String name, int age, String phoneNumber, String address,double salary, String department){
            // this.name= name;
            // this.age = age;
            // this.phoneNumber = phoneNumber;
            // this.address = address;
            // this.salary = salary;
            super(name, age, phoneNumber, address, salary);
            this.department = department;
    }

    public void printDetails(){
        // System.out.println("Manager Name: "+this.name);
        // System.out.println("Manager Age: "+this.age);
        // System.out.println("Manager Mobile Number: "+this.phoneNumber);
        // System.out.println("Manager Address: "+this.address);
        // System.out.println("Manager Salary: "+printSalary());
        super.printDetails();
        System.out.println("Department:"+this.department);
    }

}
public class Lab6_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the name of the employee: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter the age of the employee: ");
        int employeeAge = sc.nextInt();
        System.out.println("Enter the phone number of the employee: ");
        String employeePhoneNumber = sc.next();
        System.out.println("Enter the address of the employee: ");
        String employeeAddress = sc.nextLine();
        System.out.println("Enter the salary of the employee: ");
        double employeeSalary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the specializations of the employee: ");
        String employeeSpecializations = sc.nextLine();

        Employee employee = new Employee(employeeName, employeeAge, employeePhoneNumber, employeeAddress, employeeSalary, employeeSpecializations);

        System.out.println("Enter the name of the manager: ");
        String managerName = sc.nextLine();
        System.out.println("Enter the age of the manager: ");
        int managerAge = sc.nextInt();
        System.out.println("Enter the phone number of the manager: ");
        String managerPhoneNumber = sc.next();
        System.out.println("Enter the address of the manager: ");
        String managerAddress = sc.nextLine();
        System.out.println("Enter the salary of the manager: ");
        double managerSalary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the department of the manager: ");
        String managerDepartment = sc.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);
        System.out.println("---- Employee Details ----");
        employee.printDetails();
        employee.printSalary();
        System.out.println("---- Manager Details ----");
        manager.printDetails();
        manager.printSalary();
        sc.close();
        

    }
}
