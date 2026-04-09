import java.util.LinkedHashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("UC5 - Preserve Insertion Order of Bogies (LinkedHashSet)");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper"); // duplicate (ignored)

        System.out.println("Final Train Formation (Order Preserved, No Duplicates):");
        System.out.println(trainFormation);
    }
}