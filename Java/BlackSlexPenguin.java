package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackSlexPenguin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line);

        while (t-- > 0) {
            String nStr = br.readLine();
            if (nStr == null) break;
            int n = Integer.parseInt(nStr);
            int[] p = new int[]{0};
            for (int k = 1; k <= n; k++) {
                int size = 1 << k;
                int hlfSz = size / 2;
                int[] nxtP = new int[size];
                for (int i = 0; i < hlfSz; i++) {
                    nxtP[i] = p[i] * 2 + 1;
                }
                for (int i = 0; i < hlfSz; i++) {
                    nxtP[hlfSz + i] = i * 2;
                }

                p = nxtP;
            }
            for (int i = 0; i < p.length; i++) {
                sb.append(p[i]).append(i == p.length - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}