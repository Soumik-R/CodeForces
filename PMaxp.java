import java.util.Scanner;
public class PMaxp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            long maxSum = 0;
            for (int j = 0; j < n; j++) {
                swap(a, 0, j);
                maxSum = Math.max(maxSum, calVal(a));
                swap(a, 0, j);
            }
            for (int i = 1; i < n; i++) {
            }
            System.out.println(maxSum);
        }
    }
    public static long calVal(int[] arr) {
        long sum = 0;
        int cMax = 0;
        for (int x : arr) {
            cMax = Math.max(cMax, x);
            sum += cMax;
        }
        return sum;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}