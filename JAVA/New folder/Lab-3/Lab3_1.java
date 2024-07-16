import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks of Subject 1 = ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2 = ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3 = ");
        int m3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4 = ");
        int m4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5 = ");
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        System.out.println(total);
        double per = (double)total /5;
        System.out.println(per);
        if(per >= 60 && per <= 100) {
            System.out.println("First Division");
        }
        else if (per >= 50 && per < 60){
            System.out.println("Second Division");
        }
        else if (per >= 40 && per < 50){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
