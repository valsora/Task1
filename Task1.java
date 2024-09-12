public class Task1 {
    public static void main(String[] args){
        System.out.println("1) " + convert(3));
        System.out.println("2) " + fitCalc(24, 2));
        System.out.println("3) " + containers(5, 0, 2));
        System.out.println("4) " + triangleType(5, 4, 5));
        System.out.println("5) " + ternaryEvaluation(1, 11));
        System.out.println("6) " + howManyItems(45, 1.8f, 1.9f));
        System.out.println("7) " + factorial(5));
        System.out.println("8) " + gcd(52, 8));
        System.out.println("9) " + ticketSaler(24, 950));
        System.out.println("10) " + tables(41, 20));
    }
    public static double convert(int gal) {
        return gal * 3.7854143254273;
    }
    public static int fitCalc(int min, int intensity) {
        return min * intensity;
    }
    public static int containers(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }
    public static String triangleType(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x) return "not a triangle";
        if (x == y && y == z) return "isosceles";
        else {
            if (x != y && x != z && y != z) return "different-sided";
            else return "equilateral";
        }
    }
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }
    public static int howManyItems(float n, float w, float h) {
        return (int)(n / 2 / w / h);
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) a = a % b;
            else b = b % a;
        }
        return a == 0 ? b : a;
    }
    public static double ticketSaler(int n, int price) {
        return n * price * 0.72;
    }
    public static int tables(int students, int tablesAvailable) {
        if (students <= tablesAvailable * 2) return 0;
        else {
            int lackingSeats = students - tablesAvailable * 2;
            return lackingSeats % 2 == 0 ? lackingSeats / 2 : lackingSeats / 2 + 1;
        }
    }
}