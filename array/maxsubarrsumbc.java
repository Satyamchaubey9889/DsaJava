import java.util.*;
 public class maxsubarrsumbc{
    public static void printmaxsubarray(int numbers[]){

        int max_sum =Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        prefix[0]= numbers[0]; 
        // creating prefix 
        for(int i=1;i<prefix.length;i++ ){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i= 0; i<numbers.length; i++) {
              int start = i;
            for(int j=i; j<numbers.length; j++) {
               int end = j;
               int curr_sum=0;
              curr_sum= start== 0 ? prefix[end] : prefix[end]-prefix[start-1];
              if(max_sum<curr_sum){
              max_sum=curr_sum;
             }
            }
             
           
        }
                    //  System.out.println("max subarray "+max_sum);
    }
    // *************kadanes algorithm************
    // 1. find the max sum of subarray in O(n) time complexity
    public static void kadanes(int numbers[]){
      int cs=0;
     int ms=Integer.MIN_VALUE;
       for(int i=0;i<numbers.length;i++){
        cs= cs+ numbers[i];
        if (cs<0){
          cs=0;
        }
        ms=Math.max(ms,cs);
       }  
       System.out.println("our max subarraysum is" +ms);    
    }
      public  static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
            // int numbers[]={2,4,6,8,10};
            // printmaxsubarray(numbers);
        }
 }