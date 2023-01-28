public class sum {
    public static void main(String args[]) {
        int n = 1234;
        int sumOdd = 0, sumEven = 0;
        while (n != 0) {
            if (n % 2 == 0)
                sumEven += n % 10;
            else
                sumOdd += n % 10;
            n /= 10;
        }
        System.out.println("\nSum of odd places = " + sumOdd);
        System.out.println("Sum of even places = " + sumEven);
    }
}