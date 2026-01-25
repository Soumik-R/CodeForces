import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class RevPer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t--> 0) {
            int n = Integer.parseInt(br.readLine());
            int[] p = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < n; i++) {
                int exp = n - i;
                if (p[i] != exp) {
                    int tIdx = -1;
                    for (int j = i + 1; j < n; j++) {
                        if (p[j] == exp) {
                            tIdx = j;
                            break;
                        }
                    }
                    rev(p, i, tIdx);
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                sb.append(p[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private static void rev(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}