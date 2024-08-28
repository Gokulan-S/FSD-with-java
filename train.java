import java.util.*;
public class train{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your seat number : ");
        int num=s.nextInt();
        
        
        if(num>=1 && num<=8){
            int seat=num%8;
            System.out.println("seat "+seat);
        
        }
        else if(num>=9 && num<=16){
            int seat=num%8;
            
            System.out.println("2nd coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }
        else if(num>=17 && num<=24){
            int seat=num%8;
            System.out.println("3rd coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));

        }else if(num>=25 && num<=32){
            int seat=num%8;
            System.out.println("4th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else if(num>=33 && num<=40){
            int seat=num%8;
            System.out.println("5th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else if(num>=41 && num<=48){
            int seat=num%8;
            System.out.println("6th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else if(num>=49 && num<=56){
            int seat=num%8;
            System.out.println("7th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else if(num>=57 && num<=64){
            int seat=num%8;
            System.out.println("8th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else if(num>=65 && num<=72){
            int seat=num%8;
            System.out.println("9th coach"+"\n"+"seat no : "+seat+"\n"+seatingArrangement(seat));
        }else{
            System.out.println("out of seat");
        }
    }
   
    public static String seatingArrangement(int seat){
        switch(seat){
            case 0:return "side upper berth";
            case 1:return "lower birth";   
            case 2:return "middle berth";  
            case 3:return "upper berth"; 
            case 4:return "lower birth";
            case 5:return "middle berth"; 
            case 6:return "upper berth"; 
            case 7:return "side lower berth"; 
            default:return " ";
        }
    }
}
