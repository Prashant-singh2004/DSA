import java.util.Arrays;
import java.util.Scanner;

public class arrayD {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        traverse(arr);

    }
    static void traverse(int[][] arr){
        //print the 2d array
        Scanner sc = new Scanner(System.in);



        for ( int i =0 ; i<arr.length ; i++){
            for ( int j =0 ; j<arr[0].length ; j++){
                System.out.println("enter the next elements");
                arr[i][j] = sc.nextInt();


            }


        }
        System.out.print("[");
        for ( int i =0 ; i<arr.length ; i++){
            System.out.print("[");
            for ( int j =0 ; j<arr[0].length ; j++){
                System.out.print(  arr[i][j] + " " ) ;



            }
            System.out.print("]");
            System.out.println();


        }
        System.out.print("]");
    }
}
