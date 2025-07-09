import java.util.*;
public class Accept_Gender {
    public static void main(String[]args){
        Scanner V=new Scanner(System.in);
        System.out.println("Enter the Gender");
        char c=V.next().charAt(0);
        System.out.println("Enter the Age: ");
        int a=V.nextInt();
        if(c=='F'){
            if(a>=1 && a<=58){
                System.out.println("The percentage of intrest is 8.2%");
            } else if (a>=59 && a<=100) {
                System.out.println("The percentage of intrest is 9.2%");
            }
            else{
                System.out.println("Invalid Age");
            }
        } else if (c=='M') {
            if(a>=1 && a<=58){
                System.out.println("The percentage of intrest is 8.4%");
            } else if (a>=59 && a>=100) {
                System.out.println("The percentage of intrest is 10.5");
            }
        }
        else{
            System.out.println("Invalid Age");
        }
    }
}
