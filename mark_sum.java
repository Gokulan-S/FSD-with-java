import java.util.*;
public class first{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=s.nextLine();
        System.out.println("Enter your Dept: ");
        String dept=s.nextLine();
        System.out.println("Enter your java mark: ");
        int java_mark=s.nextInt();
        System.out.println("Enter your python mark: ");
        int python_mark=s.nextInt();
        System.out.println("Enter your dbms mark: ");
        int dbms_mark=s.nextInt();
        
        int total_mark=java_mark+python_mark+dbms_mark;
        System.out.println("your name : "+name+"\n"+"your dept : "+dept+"\n"+"total mark: "+total_mark);

      
    }
}
