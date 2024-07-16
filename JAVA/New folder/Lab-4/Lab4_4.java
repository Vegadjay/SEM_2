/**
 * Lab4_4
 */
import java.util.Scanner;
public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Range : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value at "+(i+1)+ " index : ");
             arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
}
