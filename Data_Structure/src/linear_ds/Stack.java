package linear_ds;

class Snode{
	int data;
	Snode next;
	public Snode(int data) {
		this.data=data;
	}
}

public class Stack {
	static Snode top;
	static int count=1;
	
	public static void pop()
	{
		if(count==-1) {
			System.out.println("Stack is empty");
			return;
		}
	}

}
