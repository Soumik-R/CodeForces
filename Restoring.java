import java.util.*;
public class Restoring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int maxVal = arr[3];
        int a = maxVal - arr[0];
        int b = maxVal - arr[1];
        int c = maxVal - arr[2];
        System.out.println(c+" "+b+" "+a);
    }
}
