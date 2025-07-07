import java.util.*;
public class Odd_Even {
    public static void main(String[]args){
        Scanner O=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int N= O.nextInt();
        if(N%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
