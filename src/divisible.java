import java.util.*;
public class divisible {
    public static void main(String[] args){
        int Count=0,num=1;
        while(Count<5){
            if(num%2==0 || num%3==0 || num%5==0){
                System.out.println(num);
                Count++;
            }
            num++;
        }
    }
}
