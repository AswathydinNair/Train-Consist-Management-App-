import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSearch_ValidSearch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = TrainConsistManagementApp.binarySearchBogie(bogies, "BG309");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = TrainConsistManagementApp.binarySearchBogie(bogies, "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] bogies = {};

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.binarySearchBogie(bogies, "BG101");
        });

        assertEquals("Cannot perform search: No bogies available in the train",
                exception.getMessage());
    }

    @Test
    void testSearch_NullArrayThrowsException() {

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.binarySearchBogie(null, "BG101");
        });

        assertEquals("Cannot perform search: No bogies available in the train",
                exception.getMessage());
    }
}