import java.util.*;
import java.util.stream.Collectors;

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create dataset (large for meaningful comparison)
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new PassengerBogie("Sleeper", (i % 100) + 20));
        }

        // ---------------- LOOP BASED ----------------
        long loopStart = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---------------- STREAM BASED ----------------
        long streamStart = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ---------------- OUTPUT ----------------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Consistency Check
        if (loopResult.size() == streamResult.size()) {
            System.out.println("Both approaches give SAME result ✅");
        } else {
            System.out.println("Mismatch in results ❌");
        }
    }
}