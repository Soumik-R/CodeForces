package Java;
import java.util.Scanner;
public class ReqRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int n = sc.nextInt();
                int m = (n - y) / x;
                int k = m * x + y;
                System.out.println(k);
            }
        }
    }
}