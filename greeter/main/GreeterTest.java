import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    public void testGreet() {
        String greeting = Greeter.greet("Christopher");
        Assertions.assertNotNull(greeting);
        Assertions.assertTrue(greeting.contains("Christopher"));
    }
}