package ex43;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;

public class AppTest {
    @Test
    public void websiteCreatorCheck(){
        website testWebsite = new website("TestSite", "Luke Faulkner", true, false);
        Assert.assertEquals("TestSite", testWebsite.getSiteName());
        Assert.assertEquals("Luke Faulkner", testWebsite.getAuthor());
        Assert.assertEquals(true, testWebsite.getJS());
        Assert.assertEquals(false, testWebsite.getCSS());
    }

    @Test
    public void pushedWebsiteCheck() throws IOException {
        website testWebsite = new website("TestSite", "Luke Faulkner", true, false);         // Creates data for directory
        createFiles.createWebFiles(testWebsite);                                                                    // Creates directory
        File testFile = new File("src/main/java/ex43/TestSite");                                           // Creates a file where the new root directory exists
        Assert.assertFalse(testFile.mkdirs());                                                                      // Returns false if root directory exists
    }
}
