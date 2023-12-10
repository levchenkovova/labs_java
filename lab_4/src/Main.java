public class Main {
    public static void main(String[] args) {
        int[] myFirstArray = {1, -2, 3, -4, 5};
        int[] mySecondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] myThirdArray = {1, 2, 3, 4, 5};
        System.out.println("First task: " + findEvenAverage(myFirstArray));
        System.out.println("Second task: " + findSumOfMinMax(mySecondArray));
        System.out.println("Third task: ");
        printArray(mergeArrays(myFirstArray, myThirdArray));
    }

    public static double findEvenAverage(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Немає парних елементів у масиві.");
            return 0;
        }

        return (double) sum / count;
    }

    static int findSumOfMinMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        return max + min;
    }

    static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        int[] C = new int[n + m];

        System.arraycopy(A, 0, C, 0, n);
        System.arraycopy(B, 0, C, n, m);

        return C;
    }

    public static void printArray(int[] arr) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // Print a new line after printing the array elements
    }
}