import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class reversearray {
   public static void reverse(int arr[]){
        //Scanner sc = new Scanner(System.in);
        int low=0; 
        int high =arr.length-1;
        while(low<high){
          int temp = arr[low];
         arr[low]= arr[high];
         arr[high] = temp;
         low++;
         high--;
        }
    }
        public static void main(String args []){
            int arr[]= {1,3,4,55,4,5};

             reverse(arr);
            for(int i = 0; i <arr.length; i++){
    System.out.println(arr[i]+ " ");
}

    }
}