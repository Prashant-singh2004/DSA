import java.util.Scanner;

public class question
{
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,5,6,14};
        int maxCurrent=arr[0], maxSoFar=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int num: arr){
            System.out.print(num + " ");
        }

    }










//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        for ( int i =0 ; i< arr.length ; i++){
//            arr[i]= sc.nextInt();
//        }
//         for ( int i =0 ; i<arr.length ; i++){
//             int sum =0 ;
//             if (( arr[i] + arr[i+1]) > arr[i]{
//                     sum=arr[i]+arr[i+1];
//                 System.out.println(sum);
//             }
//             else { arr
//
//
//             }
//         }
//
//
//    }
}
