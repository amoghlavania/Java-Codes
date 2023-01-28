import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
       int num = sc.nextInt();
        int temp = num;
        int c = 0;
        while (num > 0) {
            int rem = num % 10;
            c = (c) + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == c) {
            System.out.println("Yes. It is an Armstrong Number.");
        } else {
            System.out.println("No. It is not a valid Armstrong Number.");
        }
        sc.close();
    }
}