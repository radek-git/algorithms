public class _43_AreaCalculator {
    public static void main(String[] args) {


        System.out.println(area(5, 7));
    }

    public static final double PI = 3.14159;
    public static double area(double radius) {
        if (radius >= 0) {
            return PI * radius * radius;
        } return -1;
    }
    public static double area(double x,double y) {
        if (x < 0 || y<0) {
            return -1;
        }return x*y;
    }
}
