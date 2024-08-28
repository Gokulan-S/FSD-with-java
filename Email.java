import java.util.Scanner;
public class Email {
	public static void main(String [] args) {
		String s="mano@gmail.com";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='@') {
				for(int j=i+1;j<s.length();j++) {
					System.out.print(s.charAt(j));
				}
			}
		}
	}
}
