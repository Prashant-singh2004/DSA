import java.util.Scanner;

public class leetcode702binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-1,0,3,5,9,12};
        int mid = 0;
        System.out.println("Enter the number to search");
        int number = sc.nextInt();
//iniitialising head tail INDEXXXXXXXX
        int head =0 ;
        int tail= arr.length-1;
        while ( head < tail){

            mid = (head+tail)/2;
            //checking value of mid index of ARRAAYYYYYYYYYY
            if(arr[mid] == number) {
                System.out.println("The number exist in the given array");
                break;
            }
            if ( number > arr[mid]){
                head = mid;
            }
            else  {
                tail = mid;
            }


        }


        System.out.println("The number doesnot exist in the given array");


        }


    }

