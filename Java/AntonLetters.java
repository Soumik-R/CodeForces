package Java;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class AntonLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Set<Character> dis = new HashSet<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                dis.add(ch);
            }
        }
        System.out.println(dis.size());
    }
}