import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] name = str.toCharArray();
        char temp;

        for ( int i=0 ; i < name.length/2 ; i++){
            temp = name[i];
            name[i] = name[name.length-i-1];
            name[name.length-i-1] = temp;

        }
        System.out.println(name);
    }
}
