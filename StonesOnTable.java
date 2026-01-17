import java.util.Scanner;
public class StonesOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();        
        String s = sc.next();
        int remCount = 0;        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                remCount++;
            }
        }
        System.out.println(remCount);
    }
}