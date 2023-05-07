public class Array {
    public static void main(String[] args) {
        int[] numbers = {53, 512, 240,78, 30};
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Найбільше число: " + maxNumber);
    }

    public static int findMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім або нульовим");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
