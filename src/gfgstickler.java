public class gfgstickler {
    public static void main(String[] args) {
        int[] arr = {9, 4, 11, 12, 6, 12};
       int left =0;
       int right =0;

       if ( arr[0]>arr[1]) {
           left = 0;
           right = 2;
       }
       else {
           left = 1;
           right = 3;
           }
        int sum=arr[left];
       for ( int i =right ; i< arr.length ; i++){
           if ( right< arr.length && arr[right] >arr[i] ){
               sum += arr[i-1];
               right = i++;
               if(i== arr.length-1){
                   sum= sum +arr[arr.length-1];
               }


           }
           else {
               i++;
           }

           }
        System.out.println(sum);
       }
}


