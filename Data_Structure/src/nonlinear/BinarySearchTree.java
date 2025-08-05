package nonlinear;
class STNode{
    int data;
    STNode left,right;
    public STNode(int data) {
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchTree {
    static STNode root;
    public static void insert(int data) {
        STNode node=new STNode(data);
        if(root==null) {
            root=node;
        }
        else {
            STNode current=root;
            while(true) {
                if(data>current.data) {
                    if(current.right==null) {
                        current.right=node;
                        break;
                    }
                    else {
                        current=current.right;
                    }
                }else {
                        if(current.left==null) {
                            current.left=node;
                            break;
                        }
                        else {
                            current=current.left;
                        }
                     }
            }
        }
    }
    public static void preorder(STNode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        insert(25);
        insert(13);
        insert(120);
        insert(70);
        insert(22);
        insert(11);
        insert(6);
        preorder(root);
    }
}