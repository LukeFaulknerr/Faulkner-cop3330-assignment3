package ex44;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class AppTest {
    @Test
    public void shouldBeFound() throws IOException, ParseException {
        Assert.assertTrue(App.findDesiredItem("Thing"));
    }
}
