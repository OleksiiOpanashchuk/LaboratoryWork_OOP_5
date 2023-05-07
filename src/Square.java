public class Square {
    public static double computeArea(double sideLength) {
        double area = sideLength * sideLength;
        return area;
    }

    public static void main(String[] args) {
        double sideLength = 8.0; // довжина сторони квадрата
        double area = computeArea(sideLength);
        System.out.println("Площа квадрата: " + area);
    }
}
