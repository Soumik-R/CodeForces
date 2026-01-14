import java.util.Scanner;
public class ultraFastMath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.next();
        String l2 = sc.next();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < l1.length(); i++) {
            if (l1.charAt(i) == l2.charAt(i)) {
                res.append('0');
            } else {
                res.append('1');
            }
        }
        System.out.println(res.toString());
    }
}