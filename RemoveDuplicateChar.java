import java.util.*;
public class RemoveDuplicateChar {
	public static void main(String [] args) {
		Scanner aakash=new Scanner(System.in);
		String a=aakash.next();
		char ch[]=new char[a.length()];
		ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=0;
				}
			}
			if(ch[i]!='0') {
				System.out.print(ch[i]);
			}
		}
	}
}
