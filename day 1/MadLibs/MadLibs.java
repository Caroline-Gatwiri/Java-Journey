import java.util.Scanner;

public class MadLibs {
        public static void main(String[] args){
            // MAD LIBS GAME
            Scanner scanner = new Scanner(System.in);

            String name;
            String place;
            String adjective;
            String adjective2;
            String noun;
            String verb;
            String animal;
            String exclamation;

            System.out.print("Enter a name: ");
            name = scanner.nextLine();
            System.out.print("Enter a place: ");
            place = scanner.nextLine();

            System.out.print("Enter an adjective: ");
            adjective =  scanner.nextLine();
            System.out.print("Enter an adjective: ");
            adjective2 =  scanner.nextLine();
            System.out.print("Enter a noun: ");
            noun =scanner.nextLine();

            System.out.print("Enter a verb: ");
            verb = scanner.nextLine();
            System.out.print("Enter a exclamation: ");
            exclamation = scanner.nextLine();
            System.out.print("Enter an animal: ");
            animal = scanner.nextLine();

            System.out.println("\nOne day, " +name+ " was walking through the "+place+" when they found a "+adjective+ " "+noun+ " .");
            System.out.println("Without thinking, they decided to "+verb+" it.");
            System.out.println("Suddenly, a "+animal+" appeared and shouted, " +exclamation+ " !");
            System.out.println("It was the beginning of a very "+adjective2+" adventure.");
            scanner.close();

        }
    }
