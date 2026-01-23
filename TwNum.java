import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class TwNum {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        String fLine = sc.next();
        if (fLine == null) return;
        int t = Integer.parseInt(fLine);
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            int m = Math.min(h, l);
            int M = Math.max(h, l);
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a <= m) {
                    c1++;
                } else if (a <= M) {
                    c2++;
                }
            }
            int res = Math.min(c1, (c1 + c2) / 2);
            out.println(res);
        }
        out.flush();
        out.close();
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
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    return null;
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}