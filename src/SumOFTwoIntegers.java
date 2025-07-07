import java.util.*;
public class SumOFTwoIntegers {
    public static void main(String[] args){
        Scanner N=new Scanner(System.in);
        System.out.print("Enter the 1st Num: ");
        int N1=N.nextInt();
        System.out.print("Enter the 2nd Num: ");
        int N2=N.nextInt();
        int N3=N1+N2;
        System.out.println("The sum of "+N1+" and "+N2+" is " + N3);
    }
}
