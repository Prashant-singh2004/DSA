import java.util.*;

public class gfgunionarray {
    public static void main(String[] args) {
        int[] a = {-8, -3, -3, -2, 0, 1, 2, 2, 6};
        int[] b = {-9, -9, 0,};

        System.out.println(findUnion(a,b));
    }
    public static String findUnion(int[] a, int[] b){

//        ArrayList<Integer> union = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for ( int nums : a){
            set.add(nums);
        }
        for (int nums : b){
            set.add(nums);
        }

            return (Arrays.toString(set.toArray()));

    }
}
