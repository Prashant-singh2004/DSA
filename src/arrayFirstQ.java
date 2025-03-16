import java.util.Arrays;
import java.util.Scanner;

public class arrayFirstQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers of an array: ");
//        taking input in array
        for(int i =0;i<5;i++){
            int n= sc.nextInt();
            arr[i]=n;
        }
        System.out.println("Enter number to search: ");
        int ans = sc.nextInt();
        boolean resultOfLinearSearch = LinearSearch(arr,ans);
        System.out.println(resultOfLinearSearch);
    }
    public static boolean LinearSearch(int[] arr,int ans){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                return true;
            }
        }
        return false;
    }
}
