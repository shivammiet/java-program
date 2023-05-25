import java.util.*;
public class searching {
    static int search(int arr[], int n,  int x){
        for (int i = 0; i<n; i++){
        if (arr[i]==x)
            return i;
        }
        return -1;      
}
    
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,67};
        int n= 5;
        int x= 3;
        System.out.println(search(arr, n, x));
    }
} 


