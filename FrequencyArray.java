import java.util.Scanner;
public class FrequencyArray {
	public static void main(String [] args) {
		int madhan[]= {1,1,1,2,2,3,4,4,4};
		int fmaadhava[]=new int[257];
		for(int i=0;i<madhan.length;i++) {
			fmaadhava[madhan[i]]++;
		}
		for(int i=0;i<fmaadhava.length;i++) {
			if(fmaadhava[i]>=1) {
				System.out.println(i+" "+fmaadhava[i]);

}   
		}
	}
}
