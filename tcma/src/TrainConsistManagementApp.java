public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {   // correct string comparison
                return true;        // stop when found
            }
        }

        return false; // not found
    }

    // Main method (for manual run)
    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean result = searchBogie(bogies, searchKey);

        if (result) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}