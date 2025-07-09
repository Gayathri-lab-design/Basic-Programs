import java.util.*;
public class PresentOrNot {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        int[] arr={1,14,34,56,7};
        System.out.println("Search Element: ");
        int K=S.nextInt();
        int index=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==K){
                index=i;
            }
        }
        System.out.println(index);
    }
}
