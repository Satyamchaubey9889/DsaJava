import java.util.*;
 public class maxsubarraysum{
    public static void printmaxsubarray(int numbers[]){
      
        int max_sum =Integer.MIN_VALUE;
        for(int i= 0; i<numbers.length; i++) {
            int start =i;

            for(int j=i; j<numbers.length; j++) {
                int end = j;
                int curr_sum=0;
                for(int k=start; k<=end;k++){
                    //calculating max
                    curr_sum+=numbers[k];
                    
                }
                    System.out.println(curr_sum);
                    if(curr_sum >max_sum){
                        max_sum= curr_sum;
                
                    }
                 
                
            }

           
        }
                     System.out.println("max subarray "+max_sum);
    }
      public  static void main(String args[]){
            int numbers[]={2,4,6,8,10};
            printmaxsubarray(numbers);
        }
 }