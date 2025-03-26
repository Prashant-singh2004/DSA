import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    private static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0; i< arr.length;i++){
            int complement = target - arr[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement)!=i){
                return new int[]{hashMap.get(complement),i};
            }
            hashMap.put(arr[i],i);
        }
        return new int[]{0};

    }
}
