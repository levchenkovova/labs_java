public class Main {
    public static void main(String[] args) {
        long[] array1 = {500L, 200L, 700L, 100L, 300L, 400L, 600L};

        long[] array2 = {900L, 1000L, 800L, 1200L, 1100L, 1400L, 1300L};
        System.out.println("First task: ");
        bubbleSort(array1);
        printArray(array1);
        System.out.println("Second task: ");
        selectionSort(array2);
        printArray(array2);
    }

    public static void bubbleSort(long arr[]) {
        int n = arr.length;
        long temp = 0L;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(long[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            long smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }


    public static void printArray(long[] arr) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // Print a new line after printing the array elements
    }
}