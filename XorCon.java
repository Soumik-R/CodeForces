import java.util.*;
import java.io.*;

public class XorCon {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            boolean[] used = new boolean[n + 1];
            
            // Construction: Fill from right to left to ensure j >= i
            // We can pair p[i] with a p[j] such that p[i] ^ p[j] = i
            // For the Easy Version, a simple constructive reversal works:
            int currentN = n;
            while (currentN > 0) {
                int k = 0;
                while ((1 << (k + 1)) - 1 <= currentN) k++;
                int m = (1 << k) - 1; 
                
                // Flip the range [m, currentN]
                for (int i = m, j = currentN; i <= currentN; i++, j--) {
                    p[i] = j;
                }
                currentN = m - 1;
            }
            
            // If n=3, logic produces [2, 1, 3] if indexed properly
            // Printing the result
            for (int i = 1; i <= n; i++) {
                out.print(p[i] + (i == n ? "" : " "));
            }
            out.println();
        }
        out.flush();
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
    }
}