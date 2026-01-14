import java.util.Scanner;
public class EasyProblemSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;        
        for (int i = 0; i < n; i++) {
            int opinion = sc.nextInt();            
            if (opinion == 1) {
                isHard = true;
                break;
            }
        }
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }        
    }
}
