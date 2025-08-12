package nonlinear;
class ANode{
    int data,height;
    ANode right,left;
    public ANode(int data) {//null 50 1
        this.data=data;
        height=1;
        left=right=null;
    }
}
public class Avl {
    static ANode root;
    static ANode createNode(int data) {
        return new ANode(data);
    }
    static int height(ANode root) {
        return root==null ? 0:root.height;
    }
    public static int balance(ANode root) {
        return root==null ? 0:height(root.left)-height(root.right);
    }
    public static ANode rightRotate(ANode y) {
        ANode x=y.left;
        ANode t2=x.right;
        x.right=y;
        y.left=t2;
        y.height=Math.max(height(y.left), height(y.right))+1;
        x.height=Math.max(height(x.left), height(x.right))+1;
        return x;
    }
    public static ANode leftRotate(ANode x) {
        ANode y=x.right;
        ANode t2=y.left;
        y.left=x;
        x.right=t2;
        x.height=Math.max(height(x.left),height(y.right))+1;
        y.height=Math.max(height(y.left),height(x.right))+1;
        return y;
    }
    public static ANode insert(ANode root,int data) {//null  50
        if(root==null) return createNode(data);
        if(data<root.data) {
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        else {
            return root;
        }
        root.height=1+Math.max(height(root.left),height(root.right));
        int bal=balance(root);
        //LL
        if(bal>1 && data<root.left.data) {
            return rightRotate(root);
        }
        //RR
        if(bal<-1 && data>root.right.data) {
            return leftRotate(root);
        }
        //LR
        if(bal>1 && data<root.left.data) {
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        //RL
        if(bal<-1 && data<root.right.data) {
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static void preorder(ANode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postOrder(ANode root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void InOrder(ANode root) {
        if(root!=null) {
            InOrder(root.left);        
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
    }
    public static ANode search(ANode root,int data) {
        ANode current=root;
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
    public static void insertAnode(int data) {//insert(null,50)
        root = insert(root,data);
    }
    public static void main(String[] args) {
        insertAnode(50);
        insertAnode(40);
        insertAnode(30);
        System.out.print("Pre Order:");
        preorder(root);
        System.out.println();
        System.out.print("Post Order:");
        postOrder(root);
        System.out.println();
        System.out.print("In Order:");
        InOrder(root);
        System.out.println();
        if(search(root,30)!=null) {            
            System.out.println("Data is found");
        }
        else {            
            System.out.println("Data not found");
        }
    }
}