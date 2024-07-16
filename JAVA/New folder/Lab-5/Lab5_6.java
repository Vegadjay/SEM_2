/**
 * Lab5_6
 */
class Static_Check { 
    static int count = 0 ;
    public static void count_static(){
        count++;
        System.out.println(count);
    }
}
public class Lab5_6 {
    public static void main(String[] args) {
        Static_Check.count_static();
        Static_Check.count_static();
        Static_Check.count_static();
  


    }
    
}
