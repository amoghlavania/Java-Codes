import java.util.Scanner;
public class SInterest 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the time(in years): ");
        double t = scanner.nextDouble();

        double SI = (p * r * t)/100;
        System.out.println("\nSimple Interest: "+SI);
        scanner.close();
    }
}
