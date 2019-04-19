import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int selection = 0;
        boolean isInt = false;
        boolean isValid = false;
        boolean isDouble = false;
        double start = 0;
        
       // validate that user enters int and that int is 1 or 2
       do {
        System.out.print("Enter 1 to convert a Fehrenheit temperature. Enter 2 to convert a Celsius temperature: ");
        if (input.hasNextInt()) {
            selection = input.nextInt();
            isInt = true;
        }
         if ((selection == 1 || selection == 2)){
            isValid = true;
        }
        else{
            System.out.println("This is not a valid selection. Please try again.");
            input.nextLine();
        }
       }
        while (!(isInt && isValid));
        
        switch (selection) {
            case 1:
                // validate that double is entered 
                do {
                    System.out.print("please enter a Fehrenheit temperature to convert: ");
                        if (input.hasNextDouble()){
                            start = input.nextDouble();
                            isDouble = true;
                        }
                        else {
                            System.out.println("This is not a valid selection. Please try again.");
                            input.next();
                        }
                }
                while (!(isDouble));
                
                // converts Fehrenheit to Celsius 
                double converted = (start - 32) / 1.8d;
                System.out.printf("%.1f degrees Fehrenheit equals %.1f degrees Celsuius.%n", start, converted);
                break;
                
            case 2:
                // validate that double is entered 
                do {
                    System.out.print("please enter a Celsius temperature to convert: ");
                        if (input.hasNextDouble()) {
                            start = input.nextDouble();
                            isDouble = true;
                        }
                        else {
                            System.out.println("This is not a valid selection. Please try again.");
                            input.next();
                        }
                }
                while (!(isDouble));
                
                // converts Celsius to Fehrenheit
                converted = (start * 1.8d) + 32; // since in scope of switch statement, compiler accepts declaration of converted in case 1
                System.out.printf("%.1f degrees Celsius equals %.1f degrees Fehrenheit.%n", start, converted);
                break;
            
            default:
                break; 
        }
              
    }    
}
