import java.io.*;


public class Lab11_4 {

    public static void main(String[] args) {
        String filename = "xyz.dat";//extension must be .dat for Data input/output stream
        try{
            DataOutputStream dos  = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF("Darshan");
            dos.writeInt(20);
            dos.writeUTF("Deep");
            dos.writeInt(21);
            dos.writeUTF("Dev");
            dos.writeInt(22);
            System.out.println("Data Written Successfully");
            dos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            while(dis.available()>0){
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }
                dis.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
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