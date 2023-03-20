import java.util.*;
public class findprimeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <=t; i++){
            int count=0;
            for(int div =1; div <=t; div++){
                if(t%div==0){
                    count++;
                }
                if(count==2)
                    System.out.println("prime no");
                    else
                        System.out.println("not prime no");
                    }
                }
            }
        }


