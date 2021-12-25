import java.util.Scanner;
public class SimpleIntrestCalc {
    public static void main(String args[])
    {
        Scanner scanner_one = new Scanner(System.in);
        System.out.println("Enter the Principle amount: ");
        int principle = scanner_one.nextInt();
        System.out.println("Enter Interest: ");
        double interest = scanner_one.nextDouble();
        System.out.println("Enter Time in years: ");
        long time = scanner_one.nextLong();
        double simple_interest = principle * (interest/100) * time;
        System.out.println("Simple interest earned on " + principle +" rupees for the period of "+ time +" year/year's is: " + simple_interest);


    }
}
