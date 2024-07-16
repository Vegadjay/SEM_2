import java.io.*;
import java.util.*;
  
public class Demo{
    public static void main(String args[]){


        // Create File ----------------------------------------------------------------------

        // File f1 = new File("abc.txt");
        // try{
        //     f1.createNewFile();
        // }catch(Exception e){
        //     System.out.println(e);
        // }




        // Read file --------------------------------------------------------------------------
            
            // 1) Byte Streams --> FileInputStream
            // try{
            //     FileInputStream f1 = new FileInputStream("abc.txt");
            //     int a = f1.read();
            //     System.out.println(a);
            //     System.out.println((char)a);

            //     while(a!=-1){
            //         System.out.print((char)a);
            //         a=f1.read();
            //     }
            // }catch(Exception e){
            //     System.out.println(e);
            // }

            // 2) Character Streams --> Reader/FileReader
            // try{
            //     Reader r1 = new FileReader("abc.txt");

            //     // System.out.println(r1.read());

            //     // char[] charArray = new char[10];
            //     // r1.read(charArray);
            //     // System.out.print(charArray);
                
            //     // File f1 = new File("abc.txt");
            //     // System.out.println(f1.length());
            //     // char[] charArray = new char[(int)f1.length()];
            
            //     // r1.read(charArray);
            //     // System.out.print(charArray);

            // }catch(Exception e){
            //     System.out.println(e);
            // }

            // 3) BufferedReader
            // try{
            //     FileReader r1 = new FileReader("abc.txt");
            //     BufferedReader b1 = new BufferedReader(r1);

            //     // System.out.println((char)b1.read());
                
            //     // char[] charArray = new char[6];
            //     // b1.read(charArray);
            //     // System.out.print(charArray);

            //     System.out.println(b1.readLine());
            //     System.out.println(b1.readLine());
            // }catch(Exception e){

            // }



        // Write file ------------------------------------------------------------------------
        
            // 1) Byte Streams --> FileOutputStream
            // try{
            //     FileOutputStream fout = new FileOutputStream("abc.txt");
            //     String s = "Welcome to OOP by FileOutputStream\n";
            //     byte a[] = s.getBytes();
            //     fout.write(a);
            //     fout.write(a);
            // }catch(Exception e){
            //     System.out.println(e);
            // }

            // 2) Character Streams --> Writer/FileWriter
            // try{
            //     Writer w1 = new FileWriter("abc.txt");
            //     String s = "Welcome to OOP by FileWriter\n";
            //     w1.write(s);
            //     w1.write(s);
            //     // w1.close();
            // }catch(Exception e){
            //     System.out.println(e);
            // }

            // 3) BufferedWriter
            // try{
            //     FileWriter w1 = new FileWriter("abc.txt");
            //     BufferedWriter b1 = new BufferedWriter(w1);

            //     b1.write("Roank Thesiya");
            //     // b1.newLine();
            //     b1.write("Roank Thesiya");
            //     // b1.close();
            // }catch(Exception e){

            // }
        

        // Delete file
        // File f1 = new File("abc.txt");
        // try{
        //     f1.delete();
        // }catch(Exception e){
        //     System.out.println(e);
        // } 


        //Scanner Read

        // try{
        //     File f1 = new File("abc.txt");
        //     Scanner sc = new Scanner(f1);
        //     sc.nextLine();
        //     sc.next();

        //     while(sc.hasNextLine()){
        //         sc.next();
        //     }
        // }catch(Exception e){

        // }
       


    }
}