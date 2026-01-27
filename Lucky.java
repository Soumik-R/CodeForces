import java.util.Scanner;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String ticket = sc.next();
            int sum1 = (ticket.charAt(0) - '0') + 
                       (ticket.charAt(1) - '0') + 
                       (ticket.charAt(2) - '0');
            int sum2 = (ticket.charAt(3) - '0') + 
                       (ticket.charAt(4) - '0') + 
                       (ticket.charAt(5) - '0');
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}