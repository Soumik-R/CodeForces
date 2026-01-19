import java.util.Scanner;
public class love_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int firstScore = sc.nextInt();
            int currentMax = firstScore;
            int currentMin = firstScore;
            int amazingCount = 0;
            for (int i = 1; i < n; i++) {
                int score = sc.nextInt();
                if (score > currentMax) {
                    currentMax = score;
                    amazingCount++;
                }
                else if (score < currentMin) {
                    currentMin = score;
                    amazingCount++;
                }
            }            
            System.out.print(amazingCount);
        }
    }
}