package sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr,int n) {
        int current=0,j;
        for(int i=1;i<arr.length;i++) {
            current=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>current) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    static void print(int[] arr,int size) {
        int i;
        for(i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {15,24,7,20,31,25,19};
        int n=arr.length;
        insertionSort(arr,n);
        System.out.println("Sorted Array:");
        print(arr,n);
    }

}