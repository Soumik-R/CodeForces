import java.util.*;
public class TheNewY {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int des = sc.nextInt();

        int a1 = Math.abs(des- a);
        int b1 = Math.abs(des - b);
        int sum = a1 + b1;
        System.out.println(sum);
    }
}
