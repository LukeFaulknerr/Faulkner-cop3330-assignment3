package ex42_test;
import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppTest {
    @Test
    public void shouldReturnFNameList() throws FileNotFoundException {
        // Expected ArrayList
        ArrayList<String> expectedFNameList = new ArrayList<String>();
        expectedFNameList.add("Mai");
        expectedFNameList.add("Jim");
        expectedFNameList.add("Aaron");
        expectedFNameList.add("Chris");
        expectedFNameList.add("Geoffrey");
        expectedFNameList.add("Fong");
        expectedFNameList.add("Sabrina");

        // Actual ArrayList
        File nameInput = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner nameScanner = new Scanner(nameInput);
        ArrayList<String> fullList = new ArrayList<String>();
        fullList = ex41.createNameArray.createArrayList(nameInput, nameScanner);
        ArrayList<String> actualFNameList = new ArrayList<String>();
        actualFNameList = ex42.divideArrayList.returnFNameList(fullList);

        // Run Test
        for (int i = 0; i < actualFNameList.size(); i++){
            Assert.assertEquals(expectedFNameList.get(i), actualFNameList.get(i));
        }
    }
    @Test
    public void shouldReturnLNameList() throws FileNotFoundException {
        // Expected ArrayList
        ArrayList<String> expectedLNameList = new ArrayList<String>();
        expectedLNameList.add("Ling");
        expectedLNameList.add("Johnson");
        expectedLNameList.add("Jones");
        expectedLNameList.add("Jones");
        expectedLNameList.add("Swift");
        expectedLNameList.add("Xiong");
        expectedLNameList.add("Zarnecki");

        // Actual ArrayList
        File nameInput = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner nameScanner = new Scanner(nameInput);
        ArrayList<String> fullList = new ArrayList<String>();
        fullList = ex41.createNameArray.createArrayList(nameInput, nameScanner);
        ArrayList<String> actualLNameList = new ArrayList<String>();
        actualLNameList = ex42.divideArrayList.returnLNameList(fullList);

        // Run Test
        for (int i = 0; i < actualLNameList.size(); i++){
            Assert.assertEquals(expectedLNameList.get(i), actualLNameList.get(i));
        }
    }

    @Test
    public void shouldReturnSalaryList() throws FileNotFoundException {
        // Expected ArrayList
        ArrayList<String> expectedSalaryList = new ArrayList<String>();
        expectedSalaryList.add("55900");
        expectedSalaryList.add("56500");
        expectedSalaryList.add("46000");
        expectedSalaryList.add("34500");
        expectedSalaryList.add("14200");
        expectedSalaryList.add("65000");
        expectedSalaryList.add("51500");

        // Actual ArrayList
        File nameInput = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner nameScanner = new Scanner(nameInput);
        ArrayList<String> fullList = new ArrayList<String>();
        fullList = ex41.createNameArray.createArrayList(nameInput, nameScanner);
        ArrayList<String> actualSalaryList = new ArrayList<String>();
        actualSalaryList = ex42.divideArrayList.returnSalaryList(fullList);

        // Run Test
        for (int i = 0; i < actualSalaryList.size(); i++){
            Assert.assertEquals(expectedSalaryList.get(i), actualSalaryList.get(i));
        }
    }

    @Test
    public void tabAmountCheck(){
        Assert.assertEquals(4, ex42.printNewArrays.tabAmount("Hi"));
    }

}
