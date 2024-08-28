import java.util.Scanner;
public class AsciiPrinter {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        for(int i=0;i<name.length();i++){
            System.out.println((int)name.charAt(i));
        }
    }

}
