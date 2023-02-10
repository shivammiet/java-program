import java.util.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;
public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r, sum=0;
        while(n!=0){
            r = n%10;
            sum = sum + r;
            n = n/10;
            
        }
        System.out.println(sum);


    }
    
}
