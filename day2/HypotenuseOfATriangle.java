import java.util.Scanner;

public class HypotenuseOfATriangle {
    public static void main(String[] arg){
        // Hypotenenuse of a triangle
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the valuer of A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the valuer of B: ");
        b = scanner.nextDouble();

        c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is: "+c);



        scanner.close();
    }
}
