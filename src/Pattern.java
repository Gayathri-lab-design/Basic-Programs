import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Input: ");
        int H = S.nextInt();
        for (int i = 1; i <= H; i++) {
            for (int j = i; j <= H; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
