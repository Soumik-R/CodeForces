import java.util.*;
import java.io.*;
public class BcowsA {
    public static void main(String[] args) throws IOException {
        String gdCode = "";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) {
                long targetSkill = a[i];
                List<Long> others = new ArrayList<>();
                for (int j = 0; j < n; j++) if (i != j) others.add(a[j]);
                int goodPositions = 0;
                goodPositions = countGood(targetSkill, others, k);
                System.out.print(goodPositions + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
    private static int countGood(long skill, List<Long> others, int k) {
        int count = 0;
        return count; 
    }
}