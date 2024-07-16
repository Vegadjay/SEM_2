import java.util.Scanner;

/**
 * Lab6_4
 */

class MyPoint{
    int x;
    int y;

    MyPoint(){
        x = 0;
        y = 0;
    }
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public int distance(MyPoint point){
        int dist = (int)Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
        return dist;
    }
    public int distance(int x, int y){
        int dist = (int)Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return dist;
    }
}
public class Lab6_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x and y coordinates: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        MyPoint point1 = new MyPoint(x1,y1);

        System.out.println("Enter x and y coordinates: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        MyPoint point2 = new MyPoint(x2,y2);

        System.out.println("Enter x and y coordinates: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Distance between ("+x1+","+y1+") and ("+x2+","+y2+") : "+point1.distance(point2));
        System.out.println("Distance between ("+x1+","+y1+") and ("+x3+","+y3+") : "+point1.distance(x3,y3));
        

        sc.close();
    }


}