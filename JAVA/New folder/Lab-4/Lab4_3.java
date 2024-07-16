/**
 * Lab4_3
 */
import java.util.Scanner;
public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.err.print("Enter Range : ");
        // int n = sc.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Value at "+(i+1)+ " index : ");
             arr[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += arr[i];
        }
        double avg = ((double)total /4);
        System.err.println("Average : "+avg);
        sc.close();
        
    }
    
}
