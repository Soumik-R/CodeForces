import java.util.Scanner;
import java.util.*;
public class AmusingJoke{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        String m = sc.next();
        String con = a1 + a2;

        char[] conA = con.toCharArray();
        char[] mA = m.toCharArray();

        Arrays.sort(conA);
        Arrays.sort(mA);

        if(Arrays.equals(conA,mA)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}