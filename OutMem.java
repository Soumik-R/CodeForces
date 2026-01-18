import java.util.*;
import java.io.*;
public class OutMem {
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int m = fr.nextInt();
            long h = fr.nextLong();
            long[] original = new long[n];
            long[] current = new long[n];
            for (int i = 0; i < n; i++) {
                original[i] = fr.nextLong();
                current[i] = original[i];
            }
            int[][] ops = new int[m][2];
            int lastCrashIndex = -1;
            for (int i = 0; i < m; i++) {
                int b = fr.nextInt() - 1;
                long c = fr.nextLong();
                ops[i][0] = b;
                ops[i][1] = (int)Math.min(c, h + 1);
                if (current[b] + c > h) {
                    lastCrashIndex = i;
                    current = new long[n]; 
                    System.arraycopy(original, 0, current, 0, n);
                } else {
                    current[b] += c;
                }
            }
            long[] result = new long[n];
            System.arraycopy(original, 0, result, 0, n);
            for (int i = lastCrashIndex + 1; i < m; i++) {
                result[ops[i][0]] += ops[i][1];
            }
            for (int i = 0; i < n; i++) {
                out.print(result[i] + (i == n - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}