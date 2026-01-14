import java.io.*;
import java.util.*;

public class BlackSlexPlants {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }
        
        out.close();
    }
    static final int Mbits = 18;

    private static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        long[][] rts = new long[Mbits][n + 2];
        long[][] cnsts = new long[Mbits][n + 2];

        for (int query = 0; query < q; query++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int lminus1 = l - 1;

            for (int k = 0; k < Mbits; k++) {
                int bitVal = 1 << k;
                int mod = 1 << (k + 1);
                
                int trgtRem = (lminus1 + bitVal) % mod;
                int dist = (trgtRem - (l % mod) + mod) % mod;
                int lprime = l + dist;
                if (lprime > r) continue;
                int remDiff = (r % mod - trgtRem + mod) % mod;
                int rprime = r - remDiff; 
                int stopIndex = rprime + mod;
                long rateVal = bitVal;
                long cnstVal = (long) -lminus1 * bitVal;
                if (lprime <= n) {
                    rts[k][lprime] += rateVal;
                    cnsts[k][lprime] += cnstVal;
                }
                if (stopIndex <= n) {
                    rts[k][stopIndex] -= rateVal;
                    cnsts[k][stopIndex] -= cnstVal;
                }
            }
        }
        for (int k = 0; k < Mbits; k++) {
            int mod = 1 << (k + 1);
            for (int i = 1; i <= n; i++) {
                if (i > mod) {
                    rts[k][i] += rts[k][i - mod];
                    cnsts[k][i] += cnsts[k][i - mod];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            long totalWater = 0;
            for (int k = 0; k < Mbits; k++) {
                totalWater += rts[k][i] * i + cnsts[k][i];
            }
            out.print(totalWater + (i == n ? "" : " "));
        }
        out.println();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null) return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}