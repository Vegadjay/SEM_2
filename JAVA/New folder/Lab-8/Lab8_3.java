import java.util.Scanner;

/**
 * Lab8_3
 */
class InSufficientFundException extends Exception{
    public InSufficientFundException(String message){
        super(message);
    }
}
public class Lab8_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double savings = 10000.00;
        try{
            System.out.print("Enter money to be withdraw : ");
            double amount = sc.nextDouble();
            withdrawMoney(amount, savings);

        }
        catch (InSufficientFundException ie){
            System.out.println(ie.getMessage());
            ie.printStackTrace();
        }
    }
    public static void withdrawMoney (double amount, double savings) throws InSufficientFundException {
        if(amount > savings) throw new InSufficientFundException("Amount money to be withdraw is greater than money save in account");
    }
}