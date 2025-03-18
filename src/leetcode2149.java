import java.sql.SQLOutput;
import java.util.Scanner;

public class leetcode2149 {
    public static void main(String[] args) {
        int temp;
        int index = 0;

        Scanner sc = new Scanner(System.in);
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

       int positive =0;
       int negative = 1;
        for (int i = 0; i < arr.length - 1; i++) {
           if (arr[i]>0 && positive<arr.length && i%2!=0){
               swap(positive,i,arr);
               positive+=2;
               negative+=2;
           }
           else if ( arr[i]<0 && negative< arr.length && i%2==0){
               swap(negative,i,arr);
               positive+=2;
               negative+=2;
           }
           else {
               positive+=2;
               negative+=2;
           }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int index , int i, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;

    }
}
