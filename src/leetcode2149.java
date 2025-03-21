import java.sql.SQLOutput;
import java.util.Scanner;

public class leetcode2149 {
    public static void main(String[] args) {
        int positive =0;
        int negative =1;

        Scanner sc = new Scanner(System.in);
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};

        int[] result = new int[arr.length];

        for ( int i =0 ; i < arr.length ; i++){
            if (arr[i]>0 ){
                result[positive] = arr[i];
                positive+=2;

            }
            else if (arr[i]<0 ){
                result[negative]= arr[i];
                negative+=2;
            }
        }
        for (int i=0 ; i< result.length ; i++){
            System.out.print(result[i]+" ");

        }
        System.out.println();
        System.out.print(result.length +" "+ arr.length);

          }
}
