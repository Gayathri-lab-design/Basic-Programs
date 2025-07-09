import java.util.*;
public class Prime {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int Count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    Count++;
                }
            }
            if (Count == 2) {
                System.out.print(i+" ");
            }
        }
    }
}