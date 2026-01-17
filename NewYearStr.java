import java.util.Scanner;

public class NewYearStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                
                System.out.println(solve(n, s));
            }
        }
    }
    private static int solve(int n, String s) {
        int costMke = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - 4; i++) {
            int currCost = 0;
            if (s.charAt(i) != '2') currCost++;
            if (s.charAt(i + 1) != '0') currCost++;
            if (s.charAt(i + 2) != '2') currCost++;
            if (s.charAt(i + 3) != '6') currCost++;
            
            costMke = Math.min(costMke, currCost);
        }
        int costRem = 0;
        int i = 0;
        while (i <= n - 4) {
            if (s.charAt(i) == '2' && 
                s.charAt(i + 1) == '0' && 
                s.charAt(i + 2) == '2' && 
                s.charAt(i + 3) == '5') {
                
                costRem++;
                i += 4;
            } else {
                i++;
            }
        }
        return Math.min(costMke, costRem);
    }
}