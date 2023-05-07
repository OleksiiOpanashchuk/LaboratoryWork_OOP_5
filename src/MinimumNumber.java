public class MinimumNumber {
    public static int findMinimum(int a, int b, int c) {
        int minimum = Math.min(a, Math.min(b, c));
        System.out.println("Найменше число: " + minimum);
        return minimum;
    }

    public static void main(String[] args) {
        int num1 = 65;
        int num2 = 21;
        int num3 = 7;

        int minimumNumber = findMinimum(num1, num2, num3);
        System.out.println("Повернене найменше число: " + minimumNumber);
    }
}
