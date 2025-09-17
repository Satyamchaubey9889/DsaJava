import java.util.*;

public class Largest {

    static int largestElement(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = {3, 3, 0, 99, -40,999}; 
        int largest = largestElement(arr);
        System.out.println("Largest element: " + largest);
    }
}
