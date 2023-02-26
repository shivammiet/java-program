import java.util.*;
public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int n1 = n;
        int sum = 0;
        int d;
        while(n>0){
            int f = 1;
            d = n %10;
            for (int i = 1 ; i <=d; i++)
            {
                f = f*i;
            }
             sum = sum+f;
             n = n/10;
        }
    
    if(n1==sum)
        System.out.println("strong number");
        else
            System.out.println("not strong no");
        }

    }

    
