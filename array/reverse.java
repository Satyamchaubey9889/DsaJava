import java.util.*;

public class reverse {
    public static void rev(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = first;
            num[first] = temp;

            first++;
            last--;

        }

    }

    public static void main(String[] args) {
        int num[]={1,4,5,2,6,8};
        rev(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
