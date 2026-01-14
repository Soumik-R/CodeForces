import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
        }
        String s = sc.next();
        int antonCount = 0;
        int danikCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                antonCount++;
            } else if (s.charAt(i) == 'D') {
                danikCount++;
            }
        }
        if (antonCount > danikCount) {
            System.out.println("Anton");
        } else if (danikCount > antonCount) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}