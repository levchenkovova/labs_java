public class Main {
    public static Double firstEquation (double a, double b, double c, double d) {
        double result = 0;
        double firstPart = 2 * Math.sin(a);
        double secondPart = Math.cos(Math.abs(b * Math.sqrt(c)));
        return Math.pow(firstPart + secondPart, d);
    }

    public static Double secondEquation (double a, double b, double c, double d) {
        double firstPart = Math.log(Math.abs(2 * a)) / (3 * Math.tan(b));
        double secondPart = Math.sqrt(c / Math.sqrt(Math.abs(d)));

        return firstPart - secondPart;
    }

    public static Double thirdEquation (double a, double b, double c, double d) {
        double firstPart = (5 * c) / Math.cos(a);
        double secondPart = Math.sqrt(Math.sinh(Math.abs(b) * c) / Math.tan(d));
        return firstPart + secondPart;
    }

    public static void main(String[] args) {
        System.out.println(firstEquation(1.234, -3.12, 5.45, 2.0));
        System.out.println(secondEquation(-2.86, 1.62, 10.874, -2.91));
        System.out.println(thirdEquation(-3.45, -2.34, 1.45, 0.83));
    }
}