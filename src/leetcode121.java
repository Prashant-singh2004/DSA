public class leetcode121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int buy = arr[0];
        int profit =0;
        for ( int i =1 ; i<arr.length ; i++){
             buy = Math.min( arr[i], buy);
             profit = Math.max(profit, (arr[i]-buy));


        }
        System.out.println(profit);

    }
}
