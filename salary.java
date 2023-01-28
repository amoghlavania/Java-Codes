import java.util.Scanner;
public class salary {
    public static void main(String args[]) {
        float base, hra, ta, ma, pf, gs, tax, netsalary;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        base = scanner.nextFloat();
        hra = base * (50.0f / 100.0f);
        ta = base * (30.0f / 100.0f);
        ma = base * (25.0f / 100.0f);
        pf = base * (10.0f / 100.0f);
        gs = base + hra + ta + ma;
        tax = gs * (10.0f / 100.0f);
        netsalary = gs - tax - pf;
        System.out.print(" +--------------------------------------------------+ \n");
        System.out.print(" +-------------------------+ \n");
        System.out.println(" + Earnings + ");
        System.out.print(" +-------------------------+ \n");
        System.out.println("   Basic Salary      "+base);
        System.out.println("   HRA               "+hra);
        System.out.println("   TA                "+ta);
        System.out.println("   MA                "+ma);
        System.out.println("   PF                "+pf);
        System.out.println("   Gross Salary      "+gs);
        System.out.print(" +-------------------------+ \n");
        System.out.println("   Net Salary                             "+netsalary);
        System.out.print(" +--------------------------------------------------+ \n");
        scanner.close();
    }
}