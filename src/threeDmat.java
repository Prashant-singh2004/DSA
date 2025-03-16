import java.util.Scanner;

public class threeDmat {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the next element");
                arr[i][j] = sc.nextInt();

            }


        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == n) {
                    count++;
                }
            }

        }
        System.out.println(" The count of the " + n + " is " + count);
    }
}

