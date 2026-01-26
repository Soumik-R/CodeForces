import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Pizza {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        StringBuilder out = new StringBuilder();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        while (t-- > 0) {
            int n = sc.nextInt();
            long Ax = sc.nextLong();
            long Ay = sc.nextLong();
            long Bx = sc.nextLong();
            long By = sc.nextLong();
            long[] x = new long[n];
            for(int i=0; i<n; i++) x[i] = sc.nextLong();
            long[] y = new long[n];
            for(int i=0; i<n; i++) y[i] = sc.nextLong();
            Point[] pnts = new Point[n];
            for(int i=0; i<n; i++) {
                pnts[i] = new Point(x[i], y[i]);
            }
            Arrays.sort(pnts);
            long dp0 = 0;
            long dp1 = 0;
            long prevL = Ay;
            long prevR = Ay;
            int i = 0;
            while(i < n) {
                long curX = pnts[i].x;
                long curL = pnts[i].y;
                long curR = pnts[i].y;
                while(i < n && pnts[i].x == curX) {
                    curL = Math.min(curL, pnts[i].y);
                    curR = Math.max(curR, pnts[i].y);
                    i++;
                }
                long dEndAtL = Math.min(
                    dp0 + Math.abs(prevL - curR), 
                    dp1 + Math.abs(prevR - curR)
                ) + Math.abs(curR - curL);
                long dEndAtR = Math.min(
                    dp0 + Math.abs(prevL - curL), 
                    dp1 + Math.abs(prevR - curL)
                ) + Math.abs(curR - curL);
                dp0 = dEndAtL;
                dp1 = dEndAtR;
                prevL = curL;
                prevR = curR;
            }
            long fDist = Math.min(
                dp0 + Math.abs(prevL - By), 
                dp1 + Math.abs(prevR - By)
            );
            long totalT = fDist + (Bx - Ax);
            out.append(totalT % MOD).append("\n");
        }
        System.out.print(out);
    }
    static class Point implements Comparable<Point> {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        public int compareTo(Point other) {
            return Long.compare(this.x, other.x);
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}