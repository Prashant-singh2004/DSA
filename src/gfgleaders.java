import java.util.ArrayList;
import java.util.Collections;

public class gfgleaders {
    public static void main(String[] args) {
        int[] arr = {30, 15, 10, 2};
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length-1];
        leaders.add(max);
        for ( int i = arr.length-2 ; i>=0 ; i--){
            if (arr[i]>max){
                leaders.add(arr[i]);
                max = arr[i];

            }
        }
        Collections.reverse(leaders);
        for ( int i =0 ; i<leaders.size(); i++){
            System.out.println(leaders.get(i));
        }
    }
}
