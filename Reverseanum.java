import java.sql.SQLOutput;
import java.util.*;
public class Reverseanum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
