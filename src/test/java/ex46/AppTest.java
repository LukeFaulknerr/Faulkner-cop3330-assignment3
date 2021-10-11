package ex46;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AppTest {
    @Test
    public void checkOutput() throws IOException {
        // Create wordfreq objects to add
        wordFreq x1 = new wordFreq("badger", 7);
        wordFreq x2 = new wordFreq("mushroom", 2);
        wordFreq x3 = new wordFreq("snake", 1);

        // Create an expected ArrayList
        ArrayList<wordFreq> a1 = new ArrayList<>();
        a1.add(x1);
        a1.add(x2);
        a1.add(x3);

        // Create an actual ArrayList
        ArrayList<wordFreq> a2;
        File inputFile = new File("src/main/java/ex46/exercise46_input.txt");
        a2 = createArrayList.extractData(inputFile);

        // Assert
        for (int i = 0; i < a1.size(); i++){
            Assert.assertEquals(a1.get(i).getName(), a2.get(i).getName());
            Assert.assertEquals(a1.get(i).getFreq(), a2.get(i).getFreq());
        }

    }
}
