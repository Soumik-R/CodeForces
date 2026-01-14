import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int currPass = 0;
        int minCap = 0;        
        for (int i = 0; i < n; i++) {
            int exiting = sc.nextInt();
            int entering = sc.nextInt();            
            currPass -= exiting;
            currPass += entering;            
            if (currPass > minCap) {
                minCap = currPass;
            }
        }
        System.out.println(minCap);       
    }
}