import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("UC10 - Count Total Seats in Train (reduce)");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: Display total
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Show original list unchanged
        System.out.println("\nOriginal Bogie List:");
        System.out.println(bogies);
    }
}