import java.util.Scanner;

public class SoldierBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int totalCost = k * (w * (w + 1) / 2);
        int amountToBorrow = totalCost - n;
        if (amountToBorrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(amountToBorrow);
        }
    }
}