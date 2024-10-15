import java.util.Scanner;
class SelectionSort {
    static void Selectionsort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
        System.out.print("selection sorted array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter array size");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.print("Enetr array elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Selectionsort(arr);
    }
}
