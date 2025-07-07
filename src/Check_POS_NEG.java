import java.util.*;
public class Check_POS_NEG {
    public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    System.out.println("Enter Num: ");
    int Num=S.nextInt();
    if(Num >0){
        System.out.println("Postive Number");
    } else if (Num==0) {
        System.out.println("Zero");
    }else{
        System.out.println("Negative Number");
    }

    }
}
