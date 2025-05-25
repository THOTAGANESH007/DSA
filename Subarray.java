public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        generateSubarrays(arr);
    }

    public static void generateSubarrays(int[] arr) {
        int n = arr.length;

        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
