package Java;
import java.util.Scanner;
public class NewYrCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();                
                System.out.println(solve(a, b));
            }
        }
    }
    private static int solve(int a, int b) {
        long sumEv = 0;
        long sumOd = 0;
        
        int lCnt = 0;
        long currSize = 1;
        
        while (true) {
            long nxtEv = sumEv;
            long nxtOd = sumOd;          
            if (lCnt % 2 == 0) {
                nxtEv += currSize;
            } else {
                nxtOd += currSize;
            }            
            boolean StWhite = (a >= nxtEv && b >= nxtOd);            
            boolean StDark = (b >= nxtEv && a >= nxtOd);            
            if (StWhite || StDark) {
                sumEv = nxtEv;
                sumOd = nxtOd;
                lCnt++;
                currSize *= 2;
            } else {
                break;
            }
        }
        return lCnt;
    }
}