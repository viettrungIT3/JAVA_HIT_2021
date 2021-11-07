package Bai_5;

public class RunMain {
    public static boolean isPrime(int n) {
        if ( n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(long n) {
        if ( n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(float n) {
        return false;
    }
    public static boolean isPrime(double n) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(8)); // false
        System.out.println(isPrime(5L)); // true
        System.out.println(isPrime(8L)); // false
        System.out.println(isPrime(8.0)); // false
        System.out.println(isPrime(8.0d)); // false
    }
}
