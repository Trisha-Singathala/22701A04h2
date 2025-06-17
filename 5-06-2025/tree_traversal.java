

class Main {
    public static void main(String[] args) {
        Tree t=new Tree(new int[] {1,2,-1,-1,3,-1,-1});
        System.out.println("The pre order elements are;");
        t.preOrder();
        System.out.println(" ");
         System.out.println("The inorder elements are;");
        t.inOrder();
        System.out.println(" ");
         System.out.println("The post order elements are;");
        t.postOrder();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
Tree(int[] node)   {
    this.root=buildTreeUsingArray(node);
    System.out.println("the index is:"+index);
} 
public Node buildTreeUsingArray(int[] node){
    index++;
    if(index>=node.length){
        return null;
    }
    if(node[index]==-1){
        return null;
    }
    Node newnode=new Node(node[index]);
    newnode.left=buildTreeUsingArray(node);
    newnode.right=buildTreeUsingArray(node);
    return newnode;
}
void preOrder(){
    Node temp=this.root;
    preOrderHelper(temp);
}
void preOrderHelper(Node temp){
    if(temp==null) return;
    System.out.print(temp.data+" ");
    preOrderHelper(temp.left);
    preOrderHelper(temp.right);
}
void inOrder(){
    var temp=this.root;
    inOrderHelper(temp);
    
}
void inOrderHelper(Node temp){
    if(temp==null) return;
        
        inOrderHelper(temp.left);
        System.out.print(temp.data+" ");
        inOrderHelper(temp.right);
    
}
void postOrder(){
    var temp=this.root;
    postOrederHelper(temp);
}
void postOrederHelper(Node temp){
    if(temp==null) return;
    postOrederHelper(temp.left);
    postOrederHelper(temp.right);
    System.out.print(temp.data+" ");
}

}
