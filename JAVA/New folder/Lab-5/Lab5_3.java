/**
 * Lab5_3
 */
import java.util.Scanner;
class String_Vowel{
    
    String str;
  
    int count_a , count_e, count_i, count_o ,count_u;
    String_Vowel(){
        this.str = "";
    
        this.count_a = 0;
        this.count_e = 0;
        this.count_i = 0;
        this.count_o = 0;
        this.count_u = 0;
    }
    
    void countEachVowelFromString(String str){
        
        this.str = str;
        for(int i = 0 ;i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                this.count_a++;
            }
            else if(str.charAt(i) == 'e'){
                this.count_e++;
            }
            else if(str.charAt(i) == 'i'){
                this.count_i++;
            }
            else if(str.charAt(i) == 'o'){
                this.count_o++;
            }
            else if(str.charAt(i) == 'u'){
                this.count_u++;
            }
        }
        System.out.println("Number of each vowels in the String"+str+" are ");
        System.out.println("A : "+this.count_a);
        System.out.println("E : "+this.count_e);
        System.out.println("I : "+this.count_i);
        System.out.println("O : "+this.count_o);
        System.out.println("U : "+this.count_u);
        count_a = 0;
        count_e = 0;
        count_i = 0;
        count_o = 0;
        count_u = 0;
        
    }
}
public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while (true) {
            System.out.print("Enter String : ");
            String str = sc.nextLine().toLowerCase();
            if(str.equals("quit")){
                break;
            }
            else{ 
                String_Vowel sv = new String_Vowel();
                sv.countEachVowelFromString(str);
            }
        }
        
    }
    
}
