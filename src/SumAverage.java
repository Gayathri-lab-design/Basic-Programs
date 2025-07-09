import java.util.*;
public class SumAverage {
    public static void main(String[] args){
        int arr[]={10,20,30};
        int sum=0;
        for(int num:arr){
            sum +=num;
        }
        double avg=sum/(double)arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
