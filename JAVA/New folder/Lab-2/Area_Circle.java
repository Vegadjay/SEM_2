//Problem 4
import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of a Circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle of radius "+radius+" : " + area);
        sc.close();
    }
}
