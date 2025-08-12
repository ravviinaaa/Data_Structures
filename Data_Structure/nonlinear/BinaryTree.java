package nonlinear;

public class BinaryTree {
	public static int print(int data) {
		System.out.println(data);
		if(data==10)
			return 10;
		else
			return print(data+1);
	}
	public static void main(String[] args) {
		System.out.println(print(1));
	}

}
