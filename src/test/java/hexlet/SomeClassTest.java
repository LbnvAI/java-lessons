package hexlet;

import org.anton.autotests.SomeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {
    @Test
    public void testSum(){
        var expected = 5;
        var actual = SomeClass.sum(2,3);
        assertEquals(expected,actual);
    }
}
