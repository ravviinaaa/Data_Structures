package nonlinear;

public class Fact {
	public static int sum(int data) {
	
		if(data<=9)
			return data;
		else
			return data%10 + sum(data/10);
	}
	public static void main(String[] args) {
		System.out.println(sum(12345));
	}


}
