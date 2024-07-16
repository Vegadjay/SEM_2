/**
 * Practice
 */
class MyThread implements Runnable {
    int threadNumber;
    MyThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("Number : "+i+"from THread "+threadNumber);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        MyThread myt1 = new MyThread(1);
        MyThread myt2 = new MyThread(2);
        Thread t1 = new Thread(myt1);
        Thread t2 = new Thread(myt2);
        t1.start();
       t2.start ();
    }
    
}