import java.util.*;
public class Initialized_Value {
    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char c=C.next().charAt(0);
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println("Alphabet");
        } else if (c>='0' && c<='9') {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}