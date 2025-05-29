import java.util.Scanner;

public class CompoundCalculator {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        double fullAmount;//Final amount A
        double principal;//Initial Amount of money P
        double r;//Annual interest rate r
        int n;//Number of times interest is compounded n
        int t;//Number od years t
        double compoundedInterest;



        System.out.println("Enter the initial Amount of money: ");
        principal = scanner.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double rate = scanner.nextDouble();
        r = rate/100;
        System.out.println("Enter Number of times interest is compounded: ");
        n = scanner.nextInt();
        System.out.println("Enter Number of years: ");
        t = scanner.nextInt();

        fullAmount = principal*Math.pow((1+(r/n)), n*t);
        compoundedInterest = fullAmount - principal;

        System.out.println("Your final amount is: "+fullAmount);
        System.out.println("Your Compound interest is: "+compoundedInterest);






        scanner.close();

    }
}
