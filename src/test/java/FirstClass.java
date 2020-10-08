import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("tests")
public class FirstClass extends TestBase{
    @Test
    void firstTest() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

    @Test
    void thirdTest() {
        assertTrue(true);
    }

    @Test
    void forthTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void fifthTest() {
        assertTrue(true);
    }

}
