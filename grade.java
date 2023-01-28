import java.util.*;
public class grade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter Marks in subject 1: ");
        total += scanner.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        total += scanner.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        total += scanner.nextInt();
        double percentage = total / 3;
        System.out.println("\nPercentage(%): " + percentage);
        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 70)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
            scanner.close();
    }
}