package Prep.src;
import java.util.*;

class WordNode{
    String word;
    int numSteps;

    public WordNode(String word,int numSteps){
        this.word=word;
        this.numSteps=numSteps;
    }
}
public class WordLadder {
    public int ladderLength(String begin, String end, List<String> list){
        LinkedList<WordNode> queue=new LinkedList<>();
        queue.add(new WordNode(begin,1));
        Set<String> dict= new HashSet<>(list);
        while(!queue.isEmpty()){
            WordNode top=queue.remove();
            String word=top.word;
            if(word.equals(end)){
                return top.numSteps;
            }
            char [] arr=word.toCharArray();
            for(int i=0;i<arr.length;i++){
                for(char c='a';c<='z';c++){
                    char temp=arr[i];
                    if(c!=arr[i]){
                        arr[i]=c;
                    }
                    String newWord=new String(arr);
                    if(dict.contains(newWord)){
                        queue.add(new WordNode(newWord,top.numSteps+1));
                        dict.remove(newWord);
                    }
                    arr[i]=temp;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        WordLadder ladder=new WordLadder();
        String begin="hit";
        String end="cog";
        List<String> dict=new ArrayList<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        System.out.println(ladder.ladderLength(begin,end,dict));
    }
}
