public class KedanesAlgorithm {
    public static void main(String[] args) {
        int [] array=new int []{-2,-3,4,-1,-2,1,5,-3};
        int max_so_far=0;
        int max_end_here=0;
        for (int i = 0; i < array.length ; i++) {
            max_end_here+=array[i];
            if (max_so_far<max_end_here){
                max_so_far=max_end_here;
            }
            if (max_end_here<0){
                max_end_here=0;
            }
        }
        System.out.println(max_so_far);
    }
}
