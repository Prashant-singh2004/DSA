import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        boolean Result = isHappy(4);
        System.out.println(Result);


    }
    public static boolean isHappy(int n) {
        int slow=n, fast=nextNumber(n);
        while(fast!=1 && slow!=fast){
            slow=nextNumber(slow);
            fast=nextNumber(fast);
            fast=nextNumber(fast);
        }
        return fast==1;
    }
    public static int nextNumber(int m){
        int sum=0;
        while(m!=0){
            int digit = m%10;
            sum+=digit*digit;
            m/=10;
        }
        return sum;
    }


}