package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class CherryT {
    static List<List<Integer>> adj;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            adj = new ArrayList<>(n + 1);
            for (int i = 0; i <= n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                int u = fs.nextInt();
                int v = fs.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            if ((dfs(1, -1) & 1) != 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }
    static int dfs(int u, int p) {
        boolean isLeaf = true;
        int currentMask = 1;
        for (int v : adj.get(u)) {
            if (v == p) continue;
            isLeaf = false;
            int childMask = dfs(v, u);
            int nextMask = 0;
            for (int r1 = 0; r1 < 3; r1++) {
                if (((currentMask >> r1) & 1) == 1) {
                    for (int r2 = 0; r2 < 3; r2++) {
                        if (((childMask >> r2) & 1) == 1) {
                            int sumRem = (r1 + r2) % 3;
                            nextMask |= (1 << sumRem);
                        }
                    }
                }
            }
            currentMask = nextMask;
        }
        if (isLeaf) {
            return 2;
        } else {
            return currentMask | 2;
        }
    }
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
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