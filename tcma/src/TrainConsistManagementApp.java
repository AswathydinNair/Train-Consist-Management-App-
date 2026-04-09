import java.util.HashSet;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("UC3 - Track Unique Bogie IDs ");
       HashSet<String> bogiesIDs = new HashSet<>();

        bogiesIDs.add("BG101");
        bogiesIDs.add("BG102");
        bogiesIDs.add("BG103");
        bogiesIDs.add("BG104");

        bogiesIDs.add("BG101");
        bogiesIDs.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.print(bogiesIDs);

    }
}
