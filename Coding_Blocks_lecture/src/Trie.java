import java.util.*;

public class Trie {
    private Node root;
    public Trie(){
        this.root=new Node('*');
    }
    public void insert(String word){
        Node curr=this.root;
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(curr.children.containsKey(ch)){
                curr=curr.children.get(ch);
            }
            else{
                Node newNode=new Node(ch);
                curr.children.put(ch,newNode);
                curr=newNode;
            }
        }
        curr.isTerminal=true;
    }
    public boolean search(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return false;
            }
            curr=curr.children.get(ch);
        }
        return curr.isTerminal;
    }
    public boolean startsWith(String prefix){
        Node curr = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return false;
            }
            curr=curr.children.get(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("Apple");
        t.insert("App");
        t.insert("Ram");
        t.insert("Rajesh");
        t.insert("Mango");
        t.insert("Man");
        System.out.println(t.search("Mangos"));
    }
}
