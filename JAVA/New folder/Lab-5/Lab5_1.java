/**
 * Lab5_1
 */
import java.util.Scanner;
class Circle{
    int radius;
    // Circle(int radius){
    //     this.radius = radius;
    // }
    public double getAreaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
}
public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle();
        double area = c.getAreaOfCircle(radius);
        System.out.println("Area : "+area);
        sc.close();
    }
    
}
