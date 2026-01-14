package Java;
import java.io.*;
import java.util.*;
public class UnfairGame {
    static long[][] C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        C = new long[32][32];
        for (int i = 0; i < 32; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            sb.append(solve(n, k)).append("\n");
        }
        System.out.print(sb);
    }
    static long solve(long n, long k) {
        int d = Long.numberOfTrailingZeros(n);
        long aliceW = 0;
        for (int L = 1; L <= d; L++) {
            long max1 = k - L;
            if (max1 < 0) continue; 
            int limit = (int) Math.min(L - 1, max1);
            for (int i = 0; i <= limit; i++) {
                aliceW += C[L - 1][i];
            }
        }
        if (d + 1 <= k) {
            aliceW++;
        }
        return n - aliceW;
    }
}