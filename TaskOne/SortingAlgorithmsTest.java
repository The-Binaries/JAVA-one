public class SortingAlgorithmsTest {
    public static void main(String[] args) {
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }

    // Sample unsorted array
    private static int[] unsortedArrayInitial = {5, 2, 9, 1, 5};

    public static void testBubbleSort() {
        int[] unsortedArray = unsortedArrayInitial.clone();

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

    public static void testSelectionSort() {
        int[] unsortedArray = unsortedArrayInitial.clone();

        System.out.println("Unsorted Array:");
        printArray(unsortedArray);

        SortingAlgorithms.selectionSort(unsortedArray);

        System.out.println("Sorted Array using Selection Sort:");
        printArray(unsortedArray);

        if (isSorted(unsortedArray)) {
            System.out.println("Selection Sort Test Passed!");
        } else {
            System.out.println("Selection Sort Test Failed!");
        }
    }

    public static void testInsertionSort() {
        int[] unsortedArray = unsortedArrayInitial.clone();

        System.out.println("Unsorted Array:");
        printArray(unsortedArray);

        SortingAlgorithms.insertionSort(unsortedArray);

        System.out.println("Sorted Array using Insertion Sort:");
        printArray(unsortedArray);

        if (isSorted(unsortedArray)) {
            System.out.println("Insertion Sort Test Passed!");
        } else {
            System.out.println("Insertion Sort Test Failed!");
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
