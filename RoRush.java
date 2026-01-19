import java.util.*;
import java.io.*;
public class RoRush {
    public static void main(String[] args) throws IOException {
        String gdCode = "";
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.hasNextInt() ? sc.nextInt() : 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            long[] b = new long[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextLong();
            Arrays.sort(b);
            String s = sc.next();
            int[] dieAt = new int[k + 1];
            Arrays.fill(dieAt, k + 1);
            int[] leftReachTime = new int[k + 1];
            int[] rightReachTime = new int[k + 1];
            Arrays.fill(leftReachTime, k + 1);
            Arrays.fill(rightReachTime, k + 1);
            int curShift = 0;
            int minS = 0, maxS = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'L') curShift--;
                else curShift++;
                if (curShift < minS) {
                    minS = curShift;
                    if (Math.abs(minS) <= k) leftReachTime[Math.abs(minS)] = Math.min(leftReachTime[Math.abs(minS)], i + 1);
                }
                if (curShift > maxS) {
                    maxS = curShift;
                    if (maxS <= k) rightReachTime[maxS] = Math.min(rightReachTime[maxS], i + 1);
                }
            }
            int[] deathCount = new int[k + 2];
            for (int i = 0; i < n; i++) {
                int idx = Arrays.binarySearch(b, a[i]);
                idx = -(idx + 1);                
                int time = k + 1;
                if (idx > 0) {
                    long distL = a[i] - b[idx - 1];
                    if (distL <= k) time = Math.min(time, leftReachTime[(int)distL]);
                }
                if (idx < m) {
                    long distR = b[idx] - a[i];
                    if (distR <= k) time = Math.min(time, rightReachTime[(int)distR]);
                }
                if (time <= k) deathCount[time]++;
            }
            int alive = n;
            for (int i = 1; i <= k; i++) {
                alive -= deathCount[i];
                out.print(alive + (i == k ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}