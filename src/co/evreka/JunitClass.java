package co.evreka;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class JunitClass {
    @Test
    public void setup(){
        String str = "This is my first JUnit program";
        assertEquals("This is my first JUnit program",str);
    }


}
