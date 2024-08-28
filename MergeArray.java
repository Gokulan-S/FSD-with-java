import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter array size");
		int n1=s.nextInt();
		int [] arr1=new int [n1];
		System.out.println("enter array elements");
		for(int i=0;i<n1;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("enter array size");
		int n2=s.nextInt();
		int [] arr2=new int [n2];
		System.out.println("enter array elements");
		for(int i=0;i<n2;i++) {
			arr2[i]=s.nextInt();
		}
		int [] arr3=new int [arr1.length+arr2.length];
		//merge arr3, arr1
		
		for(int i=0;i<n1;i++) {
			arr3[i]=arr1[i];
		}
		//merge arr3, arr2
		for(int i=0;i<n2;i++) {
			arr3[i+n1]=arr2[i];
		}
		//sort the array
		Arrays.sort(arr3);
		//remove duplicates in array
		for(int i=0;i<arr1.length+arr2.length;i++) {
			for(int j=i+1;j<arr1.length+arr2.length;j++) {
				if(arr3[i]==arr3[j]) {
					arr3[j]=0;
				}
			}
		}
		
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]!=0) {
				System.out.print(arr3[i]+" ");
			}
		}
		
		                                                                        
	}
}
