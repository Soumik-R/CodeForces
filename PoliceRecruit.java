import java.util.*;
public class PoliceRecruit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int avail = 0;
        int unTreat = 0;
        for(int i =0; i<n; i++){
            int ev = sc.nextInt();
            if(ev == -1){
                if(avail>0){
                    avail--;
                }else{
                    unTreat++;
                }
            }else{
                avail+=ev;
            }
        }
        System.out.println(unTreat);
    }
}
