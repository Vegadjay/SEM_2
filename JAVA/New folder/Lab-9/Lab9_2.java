public class Lab9_2 {
    public static void main(String[] args) {
        Thread odd = new Odd();
        Thread even = new Even();

        odd.start();
        even.start();
    }
}

class Odd extends Thread{
    public void run(){
        try{
            for(int i=1;i<=20;i+=2){
                System.out.println("Odd Thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Even extends Thread{

    public void run(){
        try{
            for(int i=2;i<=20;i+=2){
                System.out.println("Even Thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}