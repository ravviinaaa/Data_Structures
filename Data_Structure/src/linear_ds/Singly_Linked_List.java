package linear_ds;

//node class

class Node{

int data;

Node next;//he is just a reference variable for node class

public Node(int data) {

this.data=data;

next=null;

}

}

//method class

class Methods{

static Node head=null;

static int count=0;

public static void insertAtBeg(int data) {

Node newnode=new Node(data);

if(head==null) {

head=newnode;

}else {

newnode.next=head;

head=newnode;

}count++;

}

public static void insertAtEnd(int data){

Node newnode=new Node(data);


if(head==null) {

insertAtBeg(data);

}else {

Node temp=head;

while(temp.next!=null) {

temp=temp.next;

}temp.next=newnode;

count++;}

}

public static void insertAtpos(int data,int pos) {

Node newnode=new Node(data);

if(pos==0) {

insertAtBeg(data);

}else {

Node temp=head;

for(int i=1;i<pos;i++) {

temp=temp.next;

}

newnode.next=temp.next;

temp.next=newnode;

}count++;

}public static void deletionAtBeg() {

if(head==null) {

return;

}else {

Node temp=head;

head=head.next;

temp.next=null;

}count--;

}

public static void deletionend() {

if(head==null) {

return;

}else {

Node temp=head;

while(temp.next.next!=null) {

temp=temp.next;

}temp.next=null;


}count--;

}public static void deletionAtpos(int pos) {

if(pos==0) {

deletionAtBeg();

}else{

Node temp=head;

for(int i=1;i<pos;i++) {

temp=temp.next;

}temp.next=temp.next.next;

count--;

}

}


public static void display() {

Node temp=head;

while(temp!=null) {

System.out.print(temp.data+" ");

temp=temp.next;

}System.out.println();

System.out.print("The length of the list: "+count);

}

}



//main class

public class Singly_Linked_List extends Methods {

public static void main(String[] args) {

insertAtBeg(1);

insertAtBeg(2);

insertAtEnd(0);

insertAtEnd(3);

insertAtpos(5,3);insertAtpos(4,4);

deletionAtBeg();

deletionend();

deletionAtpos(1);

display();

}




}

