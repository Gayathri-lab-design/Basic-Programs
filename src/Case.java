import java.util.*;
public class Case {
    public static void main(String[] args){
        Scanner B=new Scanner(System.in);
        char ch=B.next().charAt(0);
        if(ch>='a' && ch<='z'){
            char upper=(char)(ch-32);
            System.out.println(upper);
        } else if (ch>='A' && ch<='Z') {
            char lower=(char)(ch+32);
            System.out.println(lower);
        }
        else{
            System.out.println("Not Albhabet");
        }
    }
}
