import java.util.*;
public class Alphabet {
    public static void main(String[]args){
        Scanner A=new Scanner(System.in);
        System.out.println("Enter 1st Character: ");
        char c1=A.next().charAt(0);
        System.out.println("Enter 2nd Character: ");
        char c2=A.next().charAt(0);
        if(c1<c2){
            System.out.println(c1+" , "+c2);
        }
        else{
            System.out.println(c2+" , "+c1);
        }
    }
}
