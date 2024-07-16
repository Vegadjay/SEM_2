/**
 * Lab7_2
 */

interface A{
     int a = 10;
    void display_A();
}

interface A1 extends A{
    int b = 11;
    void display_A1();
}

interface A2 extends A{
    int c = 12;
    void display_A2();
}

interface A12 extends A1, A2{
    int d = 13;
    void display_A12();
}

class B implements A12{
    public void display_A(){
        System.out.println("Constant Value from Interface A : "+a);

    }
    public void display_A1(){
        System.out.println("Constant Value from Interface A1 : "+b);

    }
    public void display_A2(){
        System.out.println("Constant Value from Interface A2 : "+c);

    }
    public void display_A12(){
        System.out.println("Constant Value from Interface A12 : "+d);

    }
}
public class Lab7_2 {

    public static void main(String[] args) {
        B b1 = new B();
        b1.display_A();
        b1.display_A1();
        b1.display_A2();
        b1.display_A12();

    }
}