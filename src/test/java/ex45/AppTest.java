package ex45;

import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AppTest {
    @Test
    public void outTest() throws IOException {
        String expectedOut = "One should never use the word \"use\" in writing. Use \"use\" instead. \n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She \n" +
                "utilizes an IDE to write her Java programs\". \n";
        String actualOut = new String(Files.readAllBytes(Paths.get("src/main/java/ex45/exercise45_output.txt")));
        Assert.assertEquals(expectedOut, actualOut);
    }
}
