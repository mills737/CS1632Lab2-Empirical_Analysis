import java.util.Random;
import java.util.Arrays;

public class RandomArrayGenerator {

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(); // Generates random integers
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Sorting Array with Bubble Sort 5 times with an Array List of 100000 ints");
        int[] averageTimeBS = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(100000);
            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();
            averageTimeBS[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeBS[i] + " ns");
        }
        int totalTimeBS = 0;
        for (int i = 0; i < averageTimeBS.length - 1; i++) {
            totalTimeBS += averageTimeBS[i];
        }
        totalTimeBS /= 5;
        System.out.println("Average Time taken: " + (totalTimeBS) + " Nanoseconds");
        System.out.println("Sorting Array with Selection Sort 5 times with an Array List of 100000 ints");
        int[] averageTimeSS = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(100000);
            long startTime = System.nanoTime();
            selectionSort(array);
            long endTime = System.nanoTime();
            averageTimeSS[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeSS[i] + " ns");
        }
        int totalTimeSS = 0;
        for (int i = 0; i < averageTimeSS.length - 1; i++) {
            totalTimeSS += averageTimeSS[i];
        }
        totalTimeSS /= 5;
        System.out.println("Average Time taken: " + (totalTimeSS) + " Nanoseconds");
        System.out.println("Sorting Array with Merge Sort 5 times with an Array List of 100000 ints");
        int[] averageTimeMS = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(100000);
            long startTime = System.nanoTime();
            MergeSort.mergeSort(array, 0, (array.length - 1));
            long endTime = System.nanoTime();
            averageTimeMS[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeMS[i] + " ns");
        }
        int totalTimeMS = 0;
        for (int i = 0; i < averageTimeMS.length - 1; i++) {
            totalTimeMS += averageTimeMS[i];
        }
        totalTimeMS /= 5;
        System.out.println("Average Time taken: " + (totalTimeMS) + " Nanoseconds");
        System.out.println("Sorting Array with Heap Sort 5 times with an Array List of 100000 ints");
        int[] averageTimeHS = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(100000);
            long startTime = System.nanoTime();
            HeapSort.heapSort(array);
            long endTime = System.nanoTime();
            averageTimeHS[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeHS[i] + " ns");
        }
        int totalTimeHS = 0;
        for (int i = 0; i < averageTimeHS.length - 1; i++) {
            totalTimeHS += averageTimeHS[i];
        }
        totalTimeHS /= 5;
        System.out.println("Average Time taken: " + (totalTimeHS) + " Nanoseconds");
        System.out.println("Sorting Array with Quick Sort 5 times with an Array List of 100000 ints");
        int[] averageTimeQS = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(100000);
            long startTime = System.nanoTime();
            Arrays.sort(array);
            long endTime = System.nanoTime();
            averageTimeQS[i] = (int) (endTime - startTime);
            System.out.println("List " +  (i + 1) + " sorted, time taken: " + averageTimeQS[i] + " ns");
        }
        int totalTimeQS = 0;
        for (int i = 0; i < averageTimeQS.length - 1; i++) {
            totalTimeQS += averageTimeQS[i];
        }
        //10000 ints Lists
        totalTimeQS /= 5;
        System.out.println("Average Time taken: " + (totalTimeQS) + " Nanoseconds");
        System.out.println("Sorting Array with Bubble Sort 5 times with an Array List of 10000 ints");
        int[] averageTimeBSM = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(10000);
            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();
            averageTimeBSM[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeBSM[i] + " ns");
        }
        int totalTimeBSM = 0;
        for (int i = 0; i < averageTimeBSM.length - 1; i++) {
            totalTimeBSM += averageTimeBSM[i];
        }
        totalTimeBSM /= 5;
        System.out.println("Average Time taken: " + (totalTimeBSM) + " Nanoseconds");
        System.out.println("Sorting Array with Selection Sort 5 times with an Array List of 10000 ints");
        int[] averageTimeSSM = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(10000);
            long startTime = System.nanoTime();
            selectionSort(array);
            long endTime = System.nanoTime();
            averageTimeSSM[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeSSM[i] + " ns");
        }
        int totalTimeSSM = 0;
        for (int i = 0; i < averageTimeSSM.length - 1; i++) {
            totalTimeSSM += averageTimeSSM[i];
        }
        totalTimeSSM /= 5;
        System.out.println("Average Time taken: " + (totalTimeSSM) + " Nanoseconds");
        System.out.println("Sorting Array with Merge Sort 5 times with an Array List of 10000 ints");
        int[] averageTimeMSM = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(10000);
            long startTime = System.nanoTime();
            MergeSort.mergeSort(array, 0, (array.length - 1));
            long endTime = System.nanoTime();
            averageTimeMSM[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeMSM[i] + " ns");
        }
        int totalTimeMSM = 0;
        for (int i = 0; i < averageTimeMSM.length - 1; i++) {
            totalTimeMSM += averageTimeMSM[i];
        }
        totalTimeMSM /= 5;
        System.out.println("Average Time taken: " + (totalTimeMSM) + " Nanoseconds");
        System.out.println("Sorting Array with Heap Sort 5 times with an Array List of 10000 ints");
        int[] averageTimeHSM = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(10000);
            long startTime = System.nanoTime();
            HeapSort.heapSort(array);
            long endTime = System.nanoTime();
            averageTimeHSM[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeHSM[i] + " ns");
        }
        int totalTimeHSM = 0;
        for (int i = 0; i < averageTimeHSM.length - 1; i++) {
            totalTimeHSM += averageTimeHSM[i];
        }
        totalTimeHSM /= 5;
        System.out.println("Average Time taken: " + (totalTimeHSM) + " Nanoseconds");
        System.out.println("Sorting Array with Quick Sort 5 times with an Array List of 10000 ints");
        int[] averageTimeQSM = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(10000);
            long startTime = System.nanoTime();
            Arrays.sort(array);
            long endTime = System.nanoTime();
            averageTimeQSM[i] = (int) (endTime - startTime);
            System.out.println("List " +  (i + 1) + " sorted, time taken: " + averageTimeQSM[i] + " ns");
        }
        int totalTimeQSM = 0;
        for (int i = 0; i < averageTimeQSM.length - 1; i++) {
            totalTimeQSM += averageTimeQSM[i];
        }
        totalTimeQSM /= 5;
        System.out.println("Average Time taken: " + (totalTimeQSM) + " Nanoseconds");
        // 1000 int lists
        System.out.println("Sorting Array with Bubble Sort 5 times with an Array List of 1000 ints");
        int[] averageTimeBSL = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(1000);
            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();
            averageTimeBSL[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeBSL[i] + " ns");
        }
        int totalTimeBSL = 0;
        for (int i = 0; i < averageTimeBSL.length - 1; i++) {
            totalTimeBSL += averageTimeBSL[i];
        }
        totalTimeBSL /= 5;
        System.out.println("Average Time taken: " + (totalTimeBSL) + " Nanoseconds");
        System.out.println("Sorting Array with Selection Sort 5 times with an Array List of 1000 ints");
        int[] averageTimeSSL = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(1000);
            long startTime = System.nanoTime();
            selectionSort(array);
            long endTime = System.nanoTime();
            averageTimeSSL[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeSSL[i] + " ns");
        }
        int totalTimeSSL = 0;
        for (int i = 0; i < averageTimeSSL.length - 1; i++) {
            totalTimeSSL += averageTimeSSL[i];
        }
        totalTimeSSL /= 5;
        System.out.println("Average Time taken: " + (totalTimeSSL) + " Nanoseconds");
        System.out.println("Sorting Array with Merge Sort 5 times with an Array List of 1000 ints");
        int[] averageTimeMSL = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(1000);
            long startTime = System.nanoTime();
            MergeSort.mergeSort(array, 0, (array.length - 1));
            long endTime = System.nanoTime();
            averageTimeMSL[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeMSL[i] + " ns");
        }
        int totalTimeMSL = 0;
        for (int i = 0; i < averageTimeMSL.length - 1; i++) {
            totalTimeMSL += averageTimeMSL[i];
        }
        totalTimeMSL /= 5;
        System.out.println("Average Time taken: " + (totalTimeMSL) + " Nanoseconds");
        System.out.println("Sorting Array with Heap Sort 5 times with an Array List of 1000 ints");
        int[] averageTimeHSL = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(1000);
            long startTime = System.nanoTime();
            HeapSort.heapSort(array);
            long endTime = System.nanoTime();
            averageTimeHSL[i] = (int) (endTime - startTime);
            System.out.println("List " + (i + 1) + " sorted, time taken: " + averageTimeHSL[i] + " ns");
        }
        int totalTimeHSL = 0;
        for (int i = 0; i < averageTimeHSL.length - 1; i++) {
            totalTimeHSL += averageTimeHSL[i];
        }
        totalTimeHSL /= 5;
        System.out.println("Average Time taken: " + (totalTimeHSL) + " Nanoseconds");
        System.out.println("Sorting Array with Quick Sort 5 times with an Array List of 1000 ints");
        int[] averageTimeQSL = new int[5];
        for (int i = 0; i < 5; i++) {
            int[] array = generateRandomArray(1000);
            long startTime = System.nanoTime();
            Arrays.sort(array);
            long endTime = System.nanoTime();
            averageTimeQSL[i] = (int) (endTime - startTime);
            System.out.println("List " +  (i + 1) + " sorted, time taken: " + averageTimeQSL[i] + " ns");
        }
        int totalTimeQSL = 0;
        for (int i = 0; i < averageTimeQSL.length - 1; i++) {
            totalTimeQSL += averageTimeQSL[i];
        }
        totalTimeQSL /= 5;
        System.out.println("Average Time taken: " + (totalTimeQSL) + " Nanoseconds");
    }
}