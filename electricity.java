import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double units;
        System.out.print("Enter Units: ");
        units = sc.nextDouble();
        double bill = 0;
        if (units > 600) {
            bill += 2.0 * (units - 600);
            units = 600;
        }
        if (units >= 400) {
            bill += 1.8 * (units - 400);
            units = 300;
        }
        if (units >= 200) {
            bill += 1.5 * (units - 200);
            units = 199;
        }
        bill += 1.2 * units;
        if (bill > 400)
            bill += bill * 0.15;
        System.out.println("Total Bill = " + bill);
        sc.close();
    }
}