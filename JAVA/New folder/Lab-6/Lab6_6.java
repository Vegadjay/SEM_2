/**
 * Lab6_6
 */
class Person{
    String name;
    int age;
    public Person(){
        name = "";
        age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printSomething(){
        System.out.println("A Person has made!!!");
    }
}

class Student extends Person{
    int roll_no;
    public Student(){
        super();
        roll_no = 0;
    }

    public Student(String name, int age, int roll_nO){
        super(name, age);
        this.roll_no = roll_nO;
    } 

    public void printSomething(){
        super.printSomething();
        System.out.println("A Student has made!!!");
    }
}
public class Lab6_6 {

    public static void main(String[] args) {
        Student s = new Student("Shatrunjay", 20, 104);
        s.printSomething();
    }
}
