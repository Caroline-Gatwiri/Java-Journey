import java.util.Scanner;

public class CircumferenceAreaAndVolumeOfACircle {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
         double Circumference;
         double Area;
         double Volume;
         double r;

        System.out.print("Please Enter the value of your radious: ");
        r = scanner.nextDouble();

        Circumference = 2 * Math.PI* r;
        Area = Math.PI* Math.pow(r,2);
        Volume = ((double) 4 /3)* Math.PI* Math.pow(r,3);

        System.out.println("The circumference of your circle is: "+Circumference);
        System.out.println("The Area of your circle is: "+Area);
        System.out.println("The Volume of your circle is: "+Volume);


        scanner.close();
    }
}
