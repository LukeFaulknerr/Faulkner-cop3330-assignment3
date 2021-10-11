package ex41_test;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppTest {
    @Test
    public void shouldReadFirstLine() throws FileNotFoundException {
        // Create Scanning Objects
        File nameInput = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner nameScanner = new Scanner(nameInput);

        // Create String for Comparison
        String lingMai = nameScanner.nextLine();
        Assert.assertEquals("Ling, Mai", lingMai);
    }

    @Test
    public void createAndOrganizeArray() throws FileNotFoundException {
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> ex = new ArrayList<String>();
        ex.add("Johnson, Jim");
        ex.add("Jones, Aaron");
        ex.add("Jones, Chris");
        ex.add("Ling, Mai");
        ex.add("Swift, Geoffrey");
        ex.add("Xiong, Fong");
        ex.add("Zarnecki, Sabrina");

        ArrayList<String> ex2 = new ArrayList<String>();
        ex2 = ex41.createNameArray.createArrayList(file, sc);
        Collections.sort(ex2);

        for (int i = 0; i < ex2.size(); i++){
            Assert.assertEquals(ex.get(i), ex2.get(i));
        }

    }
}
