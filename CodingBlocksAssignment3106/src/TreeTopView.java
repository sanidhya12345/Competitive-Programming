import java.util.*;
import java.io.*;
public class TreeTopView {
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        BinaryTree bt=new BinaryTree(arr);

        bt.topview();

    }
}

class BinaryTree
{
    private class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }

    Node root;

    BinaryTree(String[] arr)
    {
        Queue<Node> queue=new LinkedList<Node>();
        construct(arr,0,queue);
    }

    public void topview()
    {
        verticalTraversalTop(this.root);
    }

    private void verticalTraversalTop(Node root) {
        int h=height(root);
        ArrayList<Integer> a=new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int y,i;
        for(i=1;i<=h;i++){
            y=0;
            levelorder(root,i,y,map);
        }
        ArrayList<Integer> sortedKeys= new ArrayList<Integer>(map.keySet());
        Collections.sort(sortedKeys);
        for(i=0;i<sortedKeys.size();i++)
        {   //a.add(sortedKeys.get(i));
            a.add(map.get(sortedKeys.get(i)));
        }
        for(int listitem:a){
            if(listitem!=-1){
                System.out.print(listitem+" ");
            }
        }
    }
    static void levelorder(Node root,int x,int y,HashMap<Integer, Integer> map){
        if(root==null) return ;
        else{
            if(x==1) {
                if(map.containsKey(y)==false){
                    map.put(y,root.data);}
            }
            else{
                if(root.left!=null) levelorder(root.left,x-1,y-1,map);
                if(root.right!=null) levelorder(root.right,x-1,y+1,map);
            }
        }
    }
    static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    private void construct(String[] arr,int ind,Queue<Node> queue)
    {
        if(ind>=arr.length)
            return;
        if(queue.size()==0)
        {
            Node nn=new Node(Integer.parseInt(arr[ind]));
            this.root=nn;
            queue.add(nn);
        }
        else
        {
            Node parent=queue.peek();
            if(parent.data!=-1){
                if(parent.left==null)
                {
                    parent.left=new Node(Integer.parseInt(arr[ind]));
                    queue.add(parent.left);
                }
                else
                {
                    if(parent.right==null)
                    {
                        parent.right=new Node(Integer.parseInt(arr[ind]));
                        queue.add(parent.right);
                        queue.poll();
                    }
                }
            }
            else
            {
                queue.poll();
                ind--;
            }
        }
        construct(arr,ind+1,queue);
    }

    public void display()
    {
        display_tree(this.root);
    }

    private void display_tree(Node root)
    {
        if(root==null)
            return;
        String str=root.data+"";
        if(root.left!=null)
        {
            str=root.left.data+" <= "+str;
        }
        else
        {
            str="END <= "+str;
        }

        if(root.right!=null)
        {
            str=str+" => "+root.right.data;
        }
        else
        {
            str=str+" => END";
        }
        System.out.println(str);
        display_tree(root.left);
        display_tree(root.right);

    }


}
