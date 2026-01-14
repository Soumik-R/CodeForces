import java.util.Scanner;
public class MaxGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                System.out.println(n / 2);
            }
        }
    }
}