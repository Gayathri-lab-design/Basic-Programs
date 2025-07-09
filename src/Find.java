import java.util.*;
public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min1, min2, max1, max2;
        if (a[0] < a[1]) {
            min1 = a[0];
            min2 = a[1];
            max1 = a[1];
            max2 = a[0];
        } else {
            min1 = a[1];
            min2 = a[0];
            max1 = a[0];
            max2 = a[1];
        }
        for (int i = 2; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println("Smallest two numbers: " + min1 + " " + min2);
        System.out.println("Largest two numbers: " + max1 + " " + max2);
    }
}
