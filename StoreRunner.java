import java.util.Scanner; //scanner class needed for user input

public class StoreRunner {
    public static void main(String[] args){

        //creates a Scanner object
        Scanner input = new Scanner(System.in);

        //variables
        String phoneDescription = "The Apple iPhone 15 5G comes with a 6.1 inch touchscreen with Crash Detection, features Dynamic Island and a new 48-megapixel main camera with 4x resolution, 20 hours of video playback. This is all powered by the Apple A16 Bionic GPU chipset.";
        String airpodDescription = "AirPods Pro are wireless Bluetooth in-ear headphones designed by Apple, initially introduced on October 30, 2019.";

        //example objects for program to use
        iPhone phone = new iPhone("iPhone 15", phoneDescription, 20000, 100, "128gb");
        Airpods airpod = new Airpods("Airpods Pro", airpodDescription, 20000, "Excellent", "2nd Gen");


        System.out.println("Apple Inventory System Loading..." + "\n..." + "\n..." + "\n...");
        System.out.println("Welcome. Which product are you looking for?");
        System.out.println("iPhone or Airpods? => ");
        String product = input.next();

        switch(product){
            case "iPhone":
                System.out.println(phone.iPhoneToString());
                break;
            case "Airpods":
                System.out.println(airpod.AirpodsToString());
                break;
            default:
                System.out.println("Product not found. Try again later.");
                break;
        }
        input.close();
    }
}