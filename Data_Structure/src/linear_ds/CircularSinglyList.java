package linear_ds;


class CNode{
    int data;
    CNode next;
    public CNode(int data) {
        this.data=data;
    }
}
class CMethods{
    static CNode head,tail;
    public static void insertAtBeg(int data) {
        CNode node=new CNode(data);
        if(head==null) {
            head=node;
            tail=node;
            node.next=head;
            return;
        }
        else {
            node.next=head;
            head=node;
            tail.next=head;
        }
    }
    public static void insertAtEnd(int data) {
        CNode node=new CNode(data);
        if (head==null) {
            head=node;
            tail=node;
            node.next=head;
            return;
        } else {
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    public static void insertAtpos(int data,int pos) {
        CNode node=new CNode(data);
        if(pos==0) {
            insertAtBeg(data);
        }else {
            CNode temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }}
    public static void deleteAtBeg() {
    	CNode temp
    }
    
public static void display() {
    CNode temp=head;
    do {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }while(temp!=head);
    System.out.println();
 }
}

public class CircularSinglyList extends CMethods {
    public static void main(String[] args) {
        insertAtBeg(0);
        insertAtBeg(12);
        insertAtBeg(2);
        insertAtBeg(3);
        insertAtEnd(5);
        insertAtEnd(10);
        insertAtpos(10,2);
        display();
    }
}