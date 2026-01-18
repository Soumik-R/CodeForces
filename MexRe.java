import java.util.Scanner;
public class MexRe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int zCnt = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) zCnt++;
            }
            if (zCnt == 0) {
                System.out.println("NO");
            }
            else if (zCnt == n) {
                System.out.println("NO");
            }
            else {
                boolean hOne = false;
                for(int x : a) if(x == 1) hOne = true;
                if (!hOne && zCnt > 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}