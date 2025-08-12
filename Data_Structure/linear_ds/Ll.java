package linear_ds;

import java.util.LinkedList;
import java.util.List;


public class Ll {
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<>();
		
		int [] arr= {14,5,7,23,6,25,13};
		int sum=0;
		for(int data:arr) {
			sum=0;
			for(int i=2;i<data/2;i++) {
				if(data%i==0)
					sum=sum+i;
			}
			if(sum==0)li.add(data);
		}
		int fact=0;
		for(int data:li) {
			for(int j=2;j<data;j++) {
				fact=0;
				for(int k=2;k<data/2;k++) {
					if(j%k==0) {
						fact++;
					}
				}
				if(fact==0) {
					sum=sum+j;
				}
					if(sum==data) {
						System.out.println(data);
					}
				}
				}
		}
		
		
		
		
		}
	



