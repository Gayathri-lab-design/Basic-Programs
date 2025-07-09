public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        int n = arr.length;
        int[] unique = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int found = 0;
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.print("After removing duplicates: {");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
