package interview_programs_practise_Arrays;

import java.util.Arrays;

public class reverse_array_by_k_position {
	
	public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper function to reverse elements within a range
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

}
