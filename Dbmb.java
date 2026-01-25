import java.util.Scanner;
public class Dbmb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                int x = sc.nextInt();
                int currSum = 0;
                for (int i = 0; i < n; i++) {
                    currSum += sc.nextInt();
                }
                if (s>= currSum&&(s-currSum)% x==0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}