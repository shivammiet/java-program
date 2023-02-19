import java.util.*;
public class primefactorize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int div = 2; div<=n; div++){
            while(n%div==0){
                n = n/div;
                System.out.println(n);
            }

        }
    }
    
}
