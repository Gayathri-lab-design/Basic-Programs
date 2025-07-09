import java.util.*;
public class PrintSum {
    public static void main(String[] args){
        Scanner G=new Scanner(System.in);
        System.out.print("Input: ");
        int N= G.nextInt();
        int sum=0;
        while(N!=0){
            int digit =N%10;
            sum=sum+digit;
            N=N/10;
        }
        System.out.print("Output: "+sum);
    }
}
