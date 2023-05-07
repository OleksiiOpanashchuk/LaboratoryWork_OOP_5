public class ArrayPrinter {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myArray = {11, 22, 23, 454, 56};
        printArray(myArray);
    }
}
