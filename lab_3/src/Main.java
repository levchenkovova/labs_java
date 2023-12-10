public class Main {
    public static Double firstEquation (double z, int k) {
        if (k > 15) throw new IllegalArgumentException("Incorrect value for argument k!!!");
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += (1  / Math.sqrt(z * i)) + Math.tan(k / i);
        }

        return sum;
    }

    public static Double secondEquation (int t, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (t < 0) {
                sum += Math.pow(t, 2) * i;
            } else if (t >= 0) {
                sum += Math.sqrt(t * i);
            }
        }
        return sum;
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static Double thirdEquation (double e) {
        if (e <= 0) throw new IllegalArgumentException("Incorrect value for argument e!!!");
        double sum = 0;
        for (int i = 1; i< Double.POSITIVE_INFINITY; i++) {
            double current = 1 / (double) (i * (i + 1));
            if (Math.abs(current) < e) {
                break;
            }
            sum += current;
        }
        return sum;
    }

    static void printResults(double z, int k) {
        System.out.print("z: " + z + "k: " + k + " result: ");
        try {
            System.out.println(firstEquation(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults2(int t, int n) {
        System.out.print("t: " + t + " n: " + n + " result: ");
        try {
            System.out.println(secondEquation(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults3(double e) {
        System.out.print("e: " + e + " result: ");
        try {
            System.out.println(thirdEquation(e));
        } catch (IllegalArgumentException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        printResults(2, 5);
        printResults2(2, 6);
        printResults3(0.1);
    }
}