

class Main {
    public static void main(String[] args) {
        Tree t=new Tree(new int[] {1,2,8,9,-1,-1,10,-1,-1,4,-1,5,-1,6,-1,7,-1,-1,3,11,-1,12,13,-1,14,-1,-1,-1,-1});
        Node root=t.getRoot();
        int heightofRoot=Tree.heightof(root);
System.out.println("height of Tree is:"+heightofRoot);
        
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
public static int heightof(Node root){
    if(root==null) return 0;
    int lh=heightof(root.left);
    int rh=heightof(root.right);
    return Math.max(lh,rh)+1;
    
}
Node getRoot(){
    return root;
}

}
