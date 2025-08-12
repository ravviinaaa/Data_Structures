package nonlinear;
import java.util.*;
public class LinearSearch {

    public static int linearSearch(int [] arr,int data) {
        for(int i=0;i<arr.length;i++) {
            if(data==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in); 
    int n=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++) {
        a[i]=sc.nextInt();
    }
    if(linearSearch(a,3)!=-1){
        System.out.println("Element is found");
    }else{
        System.out.println("Element is not found");
    }
    }

}