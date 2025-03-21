import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class gfgunionarray {
    public static void main(String[] args) {
        int[] a = {-8, -3, -3, -2, 0, 1, 2, 2, 6};
        int[] b = {-9, -9, 0,
        };

        System.out.println(findUnion(a,b));
    }
    public static  ArrayList<Integer> findUnion(int a[], int b[]){

        ArrayList<Integer> union = new ArrayList<>();
        for ( int i : a){
            if ( !union.contains(i)) {
                union.add(i);
            }
        }
        for ( int element : b ){
            if ( !union.contains(element)){
                union.add(element);
            }

        }
        Collections.sort(union);

        return union;

    }
}
