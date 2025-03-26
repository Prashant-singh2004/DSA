import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GFGFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> arr = factorial(n);
        System.out.println(arr);
//        factorial(n);
    }

    private static ArrayList<Long> factorial(Long n) {
        if(n==1){
            return new ArrayList<Long>(List.of(1L));

        }
        ArrayList<Long> result = new ArrayList<>();
        long fact=1;
        long number=1;
        helper(n,result,fact, number);
        return result;
    }

    private static void helper(long n, ArrayList<Long> result, long fact, long number) {
        if(fact*number>=n){
            return;
        }
        fact *= number;
        result.add(fact);
        helper(n,result,fact,number+1);

    }


}
