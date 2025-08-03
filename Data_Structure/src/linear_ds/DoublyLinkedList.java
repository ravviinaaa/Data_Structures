package linear_ds;

class DubNode{
    int data;
    DubNode prev,next;
    public DubNode(int data) {
        this.data=data;
        prev=next=null;
    }
}
class DubMethods{
    static DubNode head,tail;
    public static void insertAtBeg(int data) {
        DubNode node=new DubNode(data);
        if(head==null && tail==null) {
            head=node;
            tail=node;
        }
        else {
        node.next=head;
        head.prev=node;
        head=node;
        }
    }
    public static void insertAtEnd(int data) {
        DubNode node=new DubNode(data);
        if(head==null && tail==null) {
            insertAtBeg(data);
        }
        else {
        node.prev=tail;
        tail.next=node;
        tail=node;
        }
    }
    public static void insertAtPos(int pos,int data) {
    	DubNode node=new DubNode(data);
    	if(pos==0) {
    		insertAtBeg(data);
    	}
    	else {
    		DubNode temp=head;
    		for(int i=1;i<pos;i++)
    		{
    			temp=temp.next;
    		}
    		node.next=temp.next;
    		temp.next.prev=node;
    		temp.next=node;
    		node.prev=temp;
    	}
    }
    public static void deletionAtBeg() {
        if(head==null && tail==null) {
            return;
        }else {
            head=head.next;
        }
    }
    public static void deletionAtEnd() {
        if(head==null && tail==null) {
            return;
        }else {
            DubNode temp=head;
            while(temp.next.next!=null) {
                temp=temp.next;
            }temp.next=null;
        }
    }  
    public static void deletionAtpos(int pos) {
        if(pos==0) {
            deletionAtBeg();
        }else{
            DubNode temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }temp.next=temp.next.next;
        }
    }
    
    public static void display() {
        DubNode temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
public class DoublyLinkedList extends DubMethods {
    public static void main(String[] args) {
        insertAtBeg(20);
        insertAtBeg(30);
        insertAtBeg(50);
        insertAtBeg(10);
        insertAtEnd(50);
        insertAtPos(2,60);
        deletionAtBeg();
        deletionAtEnd();
        deletionAtpos(2);
        display();
    }
}