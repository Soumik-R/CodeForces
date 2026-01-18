import java.util.*;
public class PerfectRoot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    if (i == n) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
