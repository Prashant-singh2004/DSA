import java.util.PriorityQueue;
import java.util.Scanner;

public class leetcode215 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6,};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
//        solution(arr, k);
//        int m = solution(arr , k);
        System.out.println(solution(arr , k));

    }

    public static int solution(int[] arr, int k) {
        PriorityQueue<Integer> prp = new PriorityQueue<>();
        int index = 0;
        while (index < arr.length) {
            prp.add(arr[index]);
            if (prp.size() > k) {
                prp.remove();
            }
            index++;


        }
        return prp.poll();
    }
}
