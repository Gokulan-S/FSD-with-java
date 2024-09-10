import java.util.Scanner;
public class FrequencyString {
	public static void main(String [] args) {
		String madhan= "abcdefghijklmnopqrstuvwxyz";
		int fmaadhava[]=new int[26];
		String m=madhan.toUpperCase();
		int c=0;
		for(int i=0;i<madhan.length();i++) {
			if(m.charAt(i)>='A'&& m.charAt(i)<='Z') {
				fmaadhava[m.charAt(i)-'A']++;
			}
			
		}
		for(int i=0;i<26;i++) {
			if(fmaadhava[i]>=1)
				c++;
		}
		if(c==26) {
			System.out.print("pangram");
		}
		else
			System.out.print("Not a pangram");
		
		
	}
}
