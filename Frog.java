import java.util.*;
import java.io.*;
public class Frog {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long mxFD = 0;
            long mxCD = -Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                mxFD = Math.max(mxFD, a * (b - 1));
                mxCD = Math.max(mxCD, a * b - c);
            }
            if (mxFD >= x) {
                System.out.println(0);
            } else if (mxCD <= 0) {
                System.out.println(-1);
            } else {
                long need = x - mxFD;
                long rbcks = (need + mxCD - 1) / mxCD;
                System.out.println(rbcks);
            }
        }
    }
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}