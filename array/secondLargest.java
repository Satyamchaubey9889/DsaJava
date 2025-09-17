public class secondLargest {
   static int secondLargestElement(int arr[]) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String args[]) {
        int arr[] = {3, 3, 0, 99, -40,999}; 
        int secondLargest= secondLargestElement(arr);
        System.out.println("Second Largest element: " + secondLargest);
    }
}
