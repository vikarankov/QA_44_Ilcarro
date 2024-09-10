package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests {
    @Test
    public void firstTests(){
        HomePage hPage = new HomePage (getDriver());

    }
}
