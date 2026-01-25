import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class RepSum {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String ln = br.readLine();
                    if (ln == null) return null;
                    st = new StringTokenizer(ln);
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
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        StringBuilder out = new StringBuilder();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            int[] suffMax = new int[n];
            suffMax[n - 1] = Math.max(a[n - 1], b[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                int lMax = Math.max(a[i], b[i]);
                suffMax[i] = Math.max(lMax, suffMax[i + 1]);
            }
            long[] pSum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pSum[i + 1] = pSum[i] + suffMax[i];
            }
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long ans = pSum[r] - pSum[l - 1];
                out.append(ans).append(" ");
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}