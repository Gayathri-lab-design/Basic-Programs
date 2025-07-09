import java.util.*;
public class WhileReverse {
    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        System.out.print("Input: ");
        int N=C.nextInt();
        int rev=0;
        while(N!=0){
        int digit=N%10;
        rev=rev*10+digit;
        N=N/10;
        }
        System.out.println(rev);
    }
}
