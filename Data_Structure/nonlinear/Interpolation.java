package nonlinear;

import java.util.Arrays;
import java.util.Scanner;

public class Interpolation {
    public static int interpolation(int[] arr,int target) {
        int low=0,high=arr.length-1;
        while(low<=high && target>=arr[low] && target<=arr[high]) {
            int pos=low+((target-arr[low])*(high-low))/(arr[high]-arr[low]);
            if(arr[pos]==target) return pos;
            else if(arr[pos]<target)low=pos+1;
            else high=pos-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element:");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the target");
        int target=sc.nextInt();
        int index=interpolation(arr,target);
        if(index !=-1) {
            System.out.println("index"+" "+index);
        }
        else {
            System.out.println("element not found");
        }
    }

}