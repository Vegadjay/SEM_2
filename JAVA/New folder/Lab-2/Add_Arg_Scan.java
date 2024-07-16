// Lab-2 Problem 1

import java.util.Scanner;

public class Add_Arg_Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1 and num2 for Scanner Class: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter a num3 and num4 for Scanner Class: ");
        int num3 = Integer.parseInt(args[0]);
        int num4 = Integer.parseInt(args[1]);

        System.out.println("----Scanner-----"); // With Scanner Class
        System.out.println(num1+" + "+num2+" = "+(num1 + num2));
        
        System.out.println("----Command Argument-----"); // With Command Line Argument
        System.out.println(num3+" + "+num4+" = "+(num3 + num4));

        sc.close();
    }
}
