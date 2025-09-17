public class checkArraySorted {
    static boolean isArraySortedAndRotated(int arr[]) {
        int count = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }
        if (arr[n - 1] > arr[0]) {
            count++;
        }

        return count <= 1;  
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 1, 2};
        boolean result = isArraySortedAndRotated(arr);
        if (result) {
            System.out.println("The array is sorted or rotated sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}