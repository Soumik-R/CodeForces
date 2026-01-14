import java.util.Scanner;

public class WordCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        String word = scanner.next();
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);        
        System.out.println(result);
        
        scanner.close();
    }
}