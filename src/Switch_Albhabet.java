import java.util.*;
public class Switch_Albhabet {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input : ");
         char Color= Sc.next().charAt(0);
         System.out.print("Output : ");
        switch (Color){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");

        }
    }
}
