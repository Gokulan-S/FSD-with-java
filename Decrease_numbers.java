import java.util.*;
public class Decrease_numbers{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");

        int n=s.nextInt();
        do{
            System.out.print(n+" ");
            n--;
        }while(n>=0);
    }
}
