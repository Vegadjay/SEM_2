import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab10_4 {
    public static void main(String[] args) {
        String filename = "students.txt";
        try{
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Darshan");
            dos.writeInt(20);
            dos.writeUTF("Deep");
            dos.writeInt(21);
            dos.writeUTF("Dev");
            dos.writeInt(22);
            System.out.println("Data Written Successfully");
            dos.close();
            // String data1= "Deep,20";
            // String data2 = "Dev,21";
            // String data3 = "Darshan,22";
            // byte[] bytes1 = data1.getBytes();
            // byte[] bytes2 = data2.getBytes();
            // byte[] bytes3 = data3.getBytes(); // Convert string to bytes using the default platform encoding
            // fos.write(bytes1);
            // fos.write(bytes2);
            // fos.write(bytes3);
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }
            dis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Student{
    String name;
    int age;
    Student(String name , int age){
        this.name= name;
        this.age=age;
    }

    public String toString(){
        return "Name : "+name+" , Age : "+age;
    }
}