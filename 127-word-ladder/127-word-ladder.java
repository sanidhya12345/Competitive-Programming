
class WordNode{
    String word;
    int numSteps;
    public WordNode(String word,int numSteps){
        this.word=word;
        this.numSteps=numSteps;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        LinkedList<WordNode> queue=new LinkedList<>();
        queue.add(new WordNode(beginWord,1));
        while(!queue.isEmpty()){
            WordNode top=queue.remove();
            String word=top.word;
            if(word.equals(endWord)){
                return top.numSteps;
            }
            char [] arr=word.toCharArray();
            for(int i=0;i<arr.length;i++){
                for(char c='a';c<='z';c++){
                    char temp=arr[i];
                    if(arr[i]!=c){
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
}