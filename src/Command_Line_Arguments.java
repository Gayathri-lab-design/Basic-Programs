import java.util.*;
public class Command_Line_Arguments {
    public static void main(String[] args) {
        Scanner O=new Scanner(System.in);
        System.out.println("Enter the Company Name: ");
        String Company=O.nextLine();
        System.out.println("Enter the City Name: ");
        String City=O.nextLine();
        System.out.println(Company+" Technologies "+City);
    }
}