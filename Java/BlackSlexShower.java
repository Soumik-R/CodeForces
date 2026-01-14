import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackSlexShower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());            
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int tSum = 0;
            for (int i = 0; i < n - 1; i++) {
                tSum += Math.abs(a[i] - a[i + 1]);
            }
            int mSum = tSum;
            int rFirst = tSum - Math.abs(a[0] - a[1]);
            mSum = Math.min(mSum, rFirst);
            int rLast = tSum - Math.abs(a[n - 2] - a[n - 1]);
            mSum = Math.min(mSum, rLast);
            for (int i = 1; i < n - 1; i++) {
                int cCost = Math.abs(a[i - 1] - a[i]) + Math.abs(a[i] - a[i + 1]);
                int nBridge = Math.abs(a[i - 1] - a[i + 1]);                
                int tempSum = tSum - cCost + nBridge;
                mSum = Math.min(mSum, tempSum);
            }

            sb.append(mSum).append("\n");
        }        
        System.out.print(sb);
    }
}