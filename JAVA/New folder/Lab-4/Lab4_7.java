/**
 * Lab4_7
 */
import java.util.Scanner;
public class Lab4_7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:" );
        String str = sc.nextLine();
        String str2 = "";
        for(int i = 0 ; i < str.length() ; i++){
            //with the help of the substring method
            // System.out.println(str.substring(0, i+1));
            str2 += str.charAt(i);
            System.out.println(str2);
        }
        sc.close();
    }
}