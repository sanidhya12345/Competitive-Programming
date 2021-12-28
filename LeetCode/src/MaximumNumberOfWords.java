public class MaximumNumberOfWords{
  public int mostWordsFound(String[] sentences) {
       int maxwords=0;
		for(String i:sentences) {
        	String [] arrayofsubwords=i.split(" ");
        	if(maxwords<arrayofsubwords.length) {
        		maxwords=arrayofsubwords.length;
        	}
        }
		return maxwords;
    }
}
