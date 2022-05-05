import java.util.HashMap;

public class Node {
    char ch;
    boolean isTerminal;
    HashMap<Character, Node> children;
    public Node(char ch){
        this.ch=ch;
        children=new HashMap<>();
        isTerminal=false;
    }
}
