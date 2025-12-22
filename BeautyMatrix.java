import java.util.Scanner;

public class BeautyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetRow = 2;
        int targetCol = 2;
        int moves = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int number = sc.nextInt();
                
                if (number == 1) {
                    moves = Math.abs(i - targetRow) + Math.abs(j - targetCol);
                }
            }
        }
        System.out.println(moves);
    }
}