import java.util.Scanner;

/**
 * Lab6_5
 */
class ThreeDPoint extends MyPoint{
    int z;
    ThreeDPoint(){
        super();
        z = 0;
    }
    ThreeDPoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ(){
        return this.z;
    }

    public int distance(ThreeDPoint point){
        int dist = (int)Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2) + Math.pow(this.z - point.getZ(), 2));
        return dist;
    }

    public int distance(int x, int y, int z){
        int dist = (int)Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z, 2));
        return dist;
    }
    
}
public class Lab6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x, y and z coordinates: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        ThreeDPoint point1 = new ThreeDPoint(x1,y1,z1);
        System.out.println("Enter x, y and z coordinates: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        ThreeDPoint point2 = new ThreeDPoint(x2,y2,z2);

        System.out.println("Enter x, y and z coordinates: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int z3 = sc.nextInt();

        System.out.println("Distance between ("+x1+","+y1+","+z1+") and ("+x2+","+y2+","+z2+") : "+point1.distance(point2));
        System.out.println("Distance between ("+x1+","+y1+","+z1+") and ("+x3+","+y3+","+z3+") : "+point1.distance(x3,y3,z3));
        sc.close();
    }
    
}
