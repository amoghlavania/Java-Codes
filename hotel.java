import java.util.*;

public class hotel {
    public static void main(String[] args) {
        System.out.println("<----Welcome to McD---->\n");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Cold Drink");
        System.out.println("4. Ice-Cream");
        System.out.println("5. Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Choose: ");
        String food = input.next();
        switch (food) {

            case "Burger":
                System.out.println("Price is 100/-");
                break;
            case "Pizza":
                System.out.println("Price is 300/-");
                break;
            case "Cold Drink":
                System.out.println("Price is 80/-");
                break;
            case "Ice-Cream":
                System.out.println("Price is 150/-");
                break;
            case "Exit":
                System.out.println("ThankYou & Visit Again");
                break;
            default:
                System.out.println("Invalid food");
        }
        input.close();
    }
}