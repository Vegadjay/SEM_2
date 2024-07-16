/**
 * Lab9_1
 */
class Greetings implements Runnable{
    String greet;
    Greetings(String greet){
        this.greet = greet;
    }

    public void run(){
        for(int i = 1 ; i <= 10; i++){
            System.out.println(this.greet);
            try {
                if(greet.equals("Good Morning")){
                    Thread.sleep(1000);
                }
                else if(greet.equals("Good Afternoon")){ 
                    Thread.sleep(3000);
                }
                else{
                    Thread.sleep(5000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
public class Lab9_1 {
    public static void main(String[] args) {
        Greetings g1 = new Greetings("Good Morning");
        Greetings g2 = new Greetings("Good Afternoon");
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g2);
        t1.start();
        t2.start();
    }
    
}
