import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class harshadnno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elemennt");
        int n = sc.nextInt(), r, sum=0;
        while(n!=0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println(sum);
         if(n%sum==0)
            System.out.println("Harshad number");
        else
        System.out.println("not harshad no");


    }
}
    

    

