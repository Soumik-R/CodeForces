import java.util.Scanner;
public class DivPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int curr = (n + 1) / 2;
                StringBuilder out = new StringBuilder();
                out.append(curr);
                for (int i = 1; i < n; i++) {
                    if (i % 2 != 0) {
                        curr += i;
                    } else {
                        curr -= i;
                    }
                    out.append(" ").append(curr);
                }
                System.out.println(out);
            }
        }
    }
}