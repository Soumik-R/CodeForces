import java.util.Scanner;

public class DivisibilityPrblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int remainder = a % b;
            
            if (remainder == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - remainder);
            }
        }
    }
}