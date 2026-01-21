import java.util.Scanner;
public class NewYh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int totalMinutes = 240;
        int tLPrb = totalMinutes - k;
        int prbSol = 0;
        int Spent = 0;
        for (int i = 1; i <= n; i++) {
            int CurrPrb = 5 * i;
            if (Spent + CurrPrb <= tLPrb) {
                Spent += CurrPrb;
                prbSol++;
            } else {
                break;
            }
        }
        System.out.println(prbSol);
    }
}