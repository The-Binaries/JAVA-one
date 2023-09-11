import java.util.Random;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000}; // Add more sizes if needed

        for (int size : sizes) {
            int[] randomArray = generateRandomArray(size);
            
            long startTime = System.nanoTime();
            bubbleSort(randomArray.clone());
            long bubbleSortTime = System.nanoTime() - startTime;
            
            startTime = System.nanoTime();
            selectionSort(randomArray.clone());
            long selectionSortTime = System.nanoTime() - startTime;
            
            startTime = System.nanoTime();
            insertionSort(randomArray.clone());
            long insertionSortTime = System.nanoTime() - startTime;
            
            System.out.println("Array Size: " + size);
            System.out.println("Bubble Sort Time (ns): " + bubbleSortTime);
            System.out.println("Selection Sort Time (ns): " + selectionSortTime);
            System.out.println("Insertion Sort Time (ns): " + insertionSortTime + "\n");
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000); // Adjust the range as needed
        }
        
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
