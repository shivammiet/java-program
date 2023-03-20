import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class frequency {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();

    int rv = 0;
    while(n > 0){
        int dig = n%10;
        n = n/10;

        if(dig == d){
            rv++;
        
    
    System.out.println(dig);

        }
    }
}