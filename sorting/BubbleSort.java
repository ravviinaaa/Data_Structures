package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		for(int i:arr) System.out.println(i);
	}

}
