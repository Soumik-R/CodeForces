import java.util.Scanner;
public class SerejaDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] cards = new int[n];
            for (int i = 0; i < n; i++) {
                cards[i] = sc.nextInt();
            }
            int left = 0;
            int right = n - 1;
            int serejaScore = 0;
            int dimaScore = 0;
            boolean serejaTurn = true;
            while (left <= right) {
                int chosenCard;
                if (cards[left] > cards[right]) {
                    chosenCard = cards[left];
                    left++;
                } else {
                    chosenCard = cards[right];
                    right--;
                }
                if (serejaTurn) {
                    serejaScore += chosenCard;
                } else {
                    dimaScore += chosenCard;
                }
                serejaTurn = !serejaTurn;
            }
            System.out.println(serejaScore + " " + dimaScore);
        }
    }
}