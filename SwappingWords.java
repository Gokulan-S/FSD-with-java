import java.util.Scanner;
public class SwappingWords {
	public static void main(String [] args) {
		String Aakash="vanakam da mapla";
		String [] arr=Aakash.split(" ");
		for(int i=0;i<arr.length-1;i++) {               
			String t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
