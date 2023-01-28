import java.util.Scanner;
public class atm {
    public static void choiceions() {
        System.out.println("1. Debit Money");
        System.out.println("2. View Balance");
        System.out.println("3. Exit");
        System.out.print("Choose choiceion: ");
    }
    public static void main(String[] args) {
        long money = 500000;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choiceions();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter the amount: ");
                int amt = scanner.nextInt();
                if (amt > money)
                    System.out.println("Insufficient Balance");
                else {
                    money -= amt;
                    System.out.println("Money is Debited Successfully");
                }
            } else if (choice == 2)
                System.out.println("Balance: " + money);
        } while (choice != 3);
        System.out.println("Visit Again");
        scanner.close();
    }
}
