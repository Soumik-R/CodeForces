import java.util.Scanner;
public class ArrayColor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean ptrn1 = true;
            boolean ptrn2 = true;
            for(int i =0; i<n; i++){
                a[i] = sc.nextInt();
                if(a[i] % 2 != i%2){
                    ptrn1 = false;
                }
                if(a[i] %2 == i%2){
                    ptrn2 = false;
                }
            }
            if(ptrn1||ptrn2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
