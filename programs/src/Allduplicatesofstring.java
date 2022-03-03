import java.util.HashMap;

public class Allduplicatesofstring {
    public static void main(String[] args) {
        String s="asdudubsaasdbbdbdvgs";
        HashMap<Character,Integer> hp=new HashMap<>();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(!hp.containsKey(s.charAt(i))){
                hp.put(s.charAt(i),1);
            }
            else{
                hp.put(s.charAt(i),hp.get(s.charAt(i))+1);
            }
        }
        System.out.println(hp);
    }
}
