import java.util.Scanner;

class TemperatureConverter {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1 to convert a Fehrenheit temperature. Enter 2 to convert a Celsius temperature: ");
        
        double t = input.nextInt();
        double start = 0.0;
        double converted = 0;
        
        if (t == 1){
            System.out.print("please enter a Fehrenheit temperature to convert: ");
            start = input.nextDouble();
            converted = (start - 32) / 1.8d;
            System.out.printf("%.1f degrees Fehrenheit equals %.1f degrees Celsuius.%n", start, converted);
        }
        
        else if (t == 2) {
            System.out.print("please enter a Celsius temperature to convert: ");
            start = input.nextDouble();
            converted = (start * 1.8d) + 32;
            System.out.printf("%.1f degrees Celsius equals %.1f degrees Fehrenheit.%n", start, converted);
        }
        else {
            System.out.println("Error.  Please try another number.");
        }
    }
    
}

