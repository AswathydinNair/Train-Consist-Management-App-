import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Input array of bogie names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Built-in sorting
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("After Sorting: " + Arrays.toString(bogieNames));
    }
}