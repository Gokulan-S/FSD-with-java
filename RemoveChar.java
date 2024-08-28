import java.util.Scanner;
public class RemoveChar {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char b=s.next().charAt(0);
		char ch[]=new char[a.length()];
		ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==b) {
				continue;
			}
			System.out.print(ch[i]);
		}
	}
}
