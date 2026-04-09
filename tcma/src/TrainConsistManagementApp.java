import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("UC4 - Maintain Ordered Bogie IDs (LinkedList)");


        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Train Consist:");
        System.out.println(trainConsist);
    }
}