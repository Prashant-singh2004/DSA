public class Recursion {
    public static void main(String[] args) {
        //create a function that prints sum of N numbers
        sum(20);
    }
    private static void sum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        sum(n-1);
    }
}
