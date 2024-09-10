import java.util.Scanner;
public class StringAlphabets {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		char []ch=s.nextLine().toCharArray();
		for(int i=0;i<ch.length;i+=2) {
			int n=ch[i+1]-'0';
			while(n-->0) {
				System.out.print(ch[i]); //abbccc
			}
		}
	}
}
