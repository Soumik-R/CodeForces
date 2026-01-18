import java.util.*;
public class ShiftMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            List<Integer> unique = new ArrayList<>();
            if (n > 0) {
                unique.add(a[0]);
                for (int i = 1; i < n; i++) {
                    if (a[i] != a[i - 1]) {
                        unique.add(a[i]);
                    }
                }
            }
            int mMEX = 0;
            int currRun = 0;
            for (int i = 0; i < unique.size(); i++) {
                if (i > 0 && unique.get(i) == unique.get(i - 1) + 1) {
                    currRun++;
                } else {
                    currRun = 1;
                }
                mMEX = Math.max(mMEX, currRun);
            }
            System.out.println(unique.isEmpty() ? 0 : mMEX);
        }
    }
}