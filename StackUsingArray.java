import java.util.Scanner;
public class StackUsingArray{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=s.nextInt();
        int stack[]=new int[n];
        int top=-1;
        boolean check=true;
        while(check){
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to peek");
            System.out.println("enter 4 to Display");
            System.out.println("enter 5 to Exit");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("PUSH");
                    if(top==n-1){
                        System.out.println("Stack overflow");
                    }
                    else{
                        System.out.println("enter data to push");
                        int x=s.nextInt();
                        top++; //-1 0
                        stack[top]=x;
                    }
                    break;
                case 2:
                    System.out.println("POP");
                    if(top==-1){
                        System.out.println("Stack underflow");
                    }
                    else{
                        System.out.println(stack[top]);
                        top--;
                    }
                    break;
                case 3:
                    System.out.println("PEEK");
                    System.out.println(stack[top]);
                    break;
                case 4:
                    System.out.println("Display");
                    for(int i=top;i>=0;i--){
                        System.out.print(stack[i]+" ");
                    }
                    System.out.println();
                    break;
                case 5:
                    check=false;
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("wrong number!!");
            }
        }
    }
}
