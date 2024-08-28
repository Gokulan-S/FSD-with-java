import java.util.Scanner;
public class NumberReverse {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//swap numbers
		for(int i=0;i<n-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
