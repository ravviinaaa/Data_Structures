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
    public static void postOrder(STNode root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void InOrder(STNode root) {
        if(root!=null) {
            InOrder(root.left);        
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
    }
    
    public static STNode search(STNode root,int data) {
        STNode current=root;
        while(current!=null) {
            if(current.data==data) {
                return current;
            }
            else if(data<current.data) {
                current=current.left;
            }
            else {
                current=current.right;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        insert(26);
        insert(22);
        insert(120);
        insert(70);
        insert(7);
        insert(11);
        insert(6);
        System.out.print("Pre Order:");
        preorder(root);
        System.out.println();
        System.out.print("Post Order:");
        postOrder(root);
        System.out.println();
        System.out.print("InOrder:");
        InOrder(root);
        if(search(root,11)!=null) {
            System.out.println("Data is in the bst");
        }
        else {
            System.out.println();
        }
        System.out.println();
    }
}