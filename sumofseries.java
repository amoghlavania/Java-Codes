public class sumofseries {
    public static void main(String args[]) {
        int n = 5;
        double i, s = 0;
        for (i = 1; i <= n; i++)
            s = s + 1 / i;
        System.out.printf("Sum is %f", s);
    }
}
