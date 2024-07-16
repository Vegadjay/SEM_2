/**
 * Practice
 */

 public class Lab8_1 {

    public static void main(String[] args) {
        int x = 1;
        try{
             x = powerOfNum(args);
        }

        catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Incorct Number format");
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(x);
    }

    public static int powerOfNum(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int a = 1;
        for(int i = 1 ; i <= y ; i++){
            a *= x;
        }
        return a;
    }
}