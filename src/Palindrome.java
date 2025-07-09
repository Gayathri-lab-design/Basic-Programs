import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner V=new Scanner(System.in);
        System.out.print("Input: ");
        int M=V.nextInt();
        int rev=0;
        int temp=M;
        while(M!=0){
            int digit=M%10;
            rev=rev*10+digit;
            M/=10;
        }
        if(rev==temp){
            System.out.println("Output: Palindrome");
        }
        else{
            System.out.println("Output: Not a Palindrome");
        }
    }
}
