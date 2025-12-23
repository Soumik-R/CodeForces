import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackSlexNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String ln = br.readLine();
        if (ln == null) return;
        int t = Integer.parseInt(ln);

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            int opt1 = a[0];            
            int opt2 = a[1] - a[0];
            sb.append(Math.max(opt1, opt2)).append("\n");
        }
        System.out.print(sb);
    }
}