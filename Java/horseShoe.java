package Java;
import java.util.Scanner;
import java.util.HashSet;
public class horseShoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> distinctColors = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            if (sc.hasNextInt()) {
                int color = sc.nextInt();
                distinctColors.add(color);
            }
        }
        int toBuy = 4 - distinctColors.size();
        System.out.println(toBuy);
    }
}