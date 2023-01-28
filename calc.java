import java.util.Scanner;
public class calc {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int opt;
        do {
            choice();
            opt = input.nextInt();
            if (opt == 1) {
                System.out.println("Enter any number: ");
                double num = input.nextDouble();
                System.out.println("Cube is: " + (num * num * num));
            } else if (opt == 2) {
                System.out.println("Enter any number: ");
                double num = input.nextDouble();
                System.out.println("Absolute value is: " + Math.abs(num));
            } else if (opt == 3) {
                System.out.println("Enter the number: ");
                double num = input.nextDouble();
                System.out.println("Enter the power: ");
                double pow = input.nextDouble();
                System.out.println(num + " to the power " + pow + ":" + Math.pow(num, pow));
            } else if (opt == 4) {
                System.out.println("Enter the decimal number: ");
                int num = input.nextInt();
                System.out.println("The binary value is:" + Integer.toBinaryString(num));
            } else if (opt == 5) {
                System.out.println("Enter the binary String: ");
                String num = input.next();
                System.out.println("The Decimal value is:" + Integer.parseInt(num, 2));
            } else if (opt == 6) {
                System.out.println("Enter the decimal value: ");
                int num = input.nextInt();
                System.out.println("The Octal value is:" + Integer.toOctalString(num));
            } else if (opt == 7) {
                System.out.println("Enter the decimal value: ");
                int num = input.nextInt();
                System.out.println("The Hexadecimal value is:" + Integer.toHexString(num));
            } else if (opt != 8)
                System.out.println("Wrong Option!!!!");
        } while (opt != 8);
        input.close();
    }
    public static void choice() {
        System.out.println("1. Calculate Cube");
        System.out.println("2. Calculate abs");
        System.out.println("3. Calculate Power");
        System.out.println("4. Convert Decimal to Binary");
        System.out.println("5. Convert Binary to Decimal");
        System.out.println("6. Convert Decimal to Octal");
        System.out.println("7. Convert Decimal to Hexadecimal");
        System.out.println("8. Exit");
        System.out.print("Choose any Option: ");
    }
}