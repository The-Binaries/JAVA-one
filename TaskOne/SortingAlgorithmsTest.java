public class SortingAlgorithmsTest {
    public static void main(String[] args) {
        testBubbleSort();
        // You can add similar calls to test other sorting algorithms here
    }

    public static void testBubbleSort() {
        int[] unsortedArray = {5, 2, 9, 1, 5}; // Sample unsorted array

        System.out.println("Unsorted Array:");
        printArray(unsortedArray);

        SortingAlgorithms.bubbleSort(unsortedArray);

        System.out.println("Sorted Array using Bubble Sort:");
        printArray(unsortedArray);

        if (isSorted(unsortedArray)) {
            System.out.println("Bubble Sort Test Passed!");
        } else {
            System.out.println("Bubble Sort Test Failed!");
        }
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to check if an array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
