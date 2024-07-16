import java.util.*;
import java.io.*;

public class Lab10_3 {
    public static void main(String[] args) {
        Scanner sc;
        int count=0;
        try{
            File f1 = new File(args[0]);
            sc = new Scanner(f1);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i) == '5'){
                        count++;
                    }
                }
            }
            System.out.println("Occurances : "+count);
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}