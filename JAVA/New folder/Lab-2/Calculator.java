//Problem 3
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st Number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter Mode of Operation = ");
        char op = sc.next().charAt(0);
        if(op == '+') {
            System.out.println(num1+" + " + num2+" = "+(num1 + num2));
        }
        else if(op == '-') {
            System.out.println(num1+" - " + num2+" = "+(num1 - num2));
        }
        else if(op == '*') {
            System.out.println(num1+" * " + num2+" = "+(num1 * num2));
        }
        else if(op == '/') {
            System.out.println(num1+" / " + num2+" = "+(num1 / num2));
        }
        else if(op == '%') {
            System.out.println(num1+" % " + num2+" = "+(num1 % num2));
        }
        else {
            System.out.println("Invalid Mode of Operation");
        }
        sc.close();
    }
}
