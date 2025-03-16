import java.util.HashMap;
import java.util.Map;

public class leetcode169 {
    public static void main(String[] args) {
        int[] arr = {8,8,7,7,7};
        System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {
        int fq =0;
        int result =0;
        Map< Integer, Integer > map = new HashMap<>();

        for ( int num : nums ){
            map.put( num , map.getOrDefault(num , 0)+1);

        }
        for ( Map.Entry<Integer , Integer> entry : map.entrySet()){
            if ( fq < entry.getValue()){
                fq = entry.getValue();
                result = entry.getKey();
            }
        }


        return result;

    }

}
