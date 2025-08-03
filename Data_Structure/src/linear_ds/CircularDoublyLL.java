package linear_ds;
class CirDubNode{
    int data;
    CirDubNode next,prev;
    public CirDubNode(int data) {
        this.data=data;
        next=null;
        prev=null;
    }
}
class CirDubMethods{
    static CirDubNode head,tail;
    static int count=0;
    public static void insertAtBeg(int data) {
        CirDubNode newnode=new CirDubNode(data);
            if(head==null && tail==null) {
                head=newnode;
                tail=newnode;
                head.next=newnode;
                head.prev=newnode;
            }else {
                newnode.next=head;
                newnode.prev=tail;
                tail.next=newnode;
                head.prev=newnode;
                head=newnode;
            }count++;
    }
     public static void insertAtEnd(int data) {
                CirDubNode newnode=new CirDubNode(data);
                if(head==null && tail==null) {
                    insertAtBeg(data);
                }else {
                    tail.next=newnode;
                    newnode.prev=tail;
                    head.prev=newnode;
                    newnode.next=head;
                    tail=newnode;
                }count++;
        }
     
     public static void insertAtpos(int data,int pos) {
    	    CirDubNode newnode=new CirDubNode(data);
    	    if(pos==0) {
    	        insertAtBeg(data);
    	    }
    	   else {    
    	        CirDubNode temp=head;
    	        for(int i=1;i<pos;i++) {
    	            temp=temp.next;
    	        }
    	        newnode.next=temp.next;
    	        temp.next.prev=newnode;
    	        temp.next=newnode;
    	        count++;
    	    }
    	}
    public static void display() {
        CirDubNode temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
        System.out.print("The length of the list: "+count);
    }
}
    

public class CircularDoublyLL extends CirDubMethods  {

    public static void main(String[] args) {
        insertAtBeg(7);insertAtBeg(8);insertAtBeg(10);insertAtBeg(13);
        insertAtEnd(25);insertAtEnd(21);insertAtpos(2,2);insertAtpos(3,3);
        display();
    
    }

}