
import java.util.Scanner;

/**
 * Jorge Maratos
 * ID#19219
 * Matthew Larrubia
 * Lab: Candy Machine
 */

public class CarShopping {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        totalCost += keylessEntry();
        totalCost += onStarSystem();
        totalCost += antiLockBrakes();
        totalCost += TelescopingSteeringWheelAndAdjustablePedals();
        totalCost += sunroof();
        totalCost += coldWeatherPackage();
        totalCost += GPS();
        totalCost +=leatherSeats();
        totalCost +=sportsPackage();
        totalCost +=dashCam();
        System.out.println(totalCost);
        //TODO: call methods that you write for each feature
        //TODO: print the total cost of the vehicle
    }

    public static int base() {
        int modelPrice = 0;
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose? "
                + "(enter full model name) > ");
        String model = in.nextLine();
        if (model.equalsIgnoreCase("Model 1")) {
            modelPrice = 15000;

        }
        if (model.equalsIgnoreCase("Model 2")) {
            modelPrice = 24000;

        }
        if (model.equalsIgnoreCase("Model 3")) {
            modelPrice = 40000;

        }
        
        return modelPrice;
   

    }

    public static int automaticWindows() {
        int payment = 0;
        System.out.print("Automatic Windows for $500? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 500;
        }

        return payment;

    }
    
    public static int keylessEntry() {
        int payment = 0;
        System.out.print("Remote keyless entry for $1000? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 1000;
        }

        return payment;
    
    
    }
    
    public static int onStarSystem() {
        int payment = 0;
        System.out.print("OnStar System for $1000? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 1000;
        }

        return payment;
    }
    public static int antiLockBrakes() {
        int payment = 0;
        System.out.print("Anti-Lock Brakes for $500? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 500;
        }

        return payment;
    }
    public static int TelescopingSteeringWheelAndAdjustablePedals() {
        int payment = 0;
        System.out.print("Telescoping Steering Wheel/Adjustable Pedals " 
                + "for $1000? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 1000;
        }

        return payment;
    }
    public static int sunroof() {
        int payment = 0;
        System.out.print("Sunroof for $800? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 800;
        }

        return payment;
    }
    public static int coldWeatherPackage() {
        int payment = 0;
        System.out.print("Cold weather packagae for $1500? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 1500;
        }

        return payment;
    }
    public static int GPS() {
        int payment = 0;
        System.out.print("GPS for $750? (y/n) > ");
        String response = in.nextLine();

        if ("y".equalsIgnoreCase(response)) {
            payment = 750;
        }

        return payment;
    }
    public static int leatherSeats() {
        int payment = 0;
        System.out.print("Leather Seats for $750? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 750;
        }

        return payment;
    }
    public static int sportsPackage() {
        int payment = 0;
        System.out.print("Sports Package for $1750? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 1750;
        }

        return payment;
    }
   public static int dashCam() {
        int payment = 0;
        System.out.print("Dash Camera for $500? (y/n) > ");
        String response = in.nextLine();

        if ("y".equals(response)) {
            payment = 500;
        }

        return payment;
    }
    
}
