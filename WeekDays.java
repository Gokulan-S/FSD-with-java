// switch case find weekdays
import java.util.Scanner;
public class WeekDays{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number");
        int Day=s.nextInt();
        switch(Day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("webnesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not in a week");
        }
    }
}
