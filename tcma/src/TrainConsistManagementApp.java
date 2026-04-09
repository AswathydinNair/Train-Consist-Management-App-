import java.util.ArrayList;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("UC2-Add Passenger Bogies to Train");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Removing 'AC Chair' :");
        passengerBogies.remove("AC Chair");

        System.out.println("Checking if 'Sleeper' exists :");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Contains Sleeper? : true");
        } else {
            System.out.println("Contains Sleeper? : false");
        }
        System.out.println("Final Train Passenger Consist:");
        System.out.print(passengerBogies);
    }
}
