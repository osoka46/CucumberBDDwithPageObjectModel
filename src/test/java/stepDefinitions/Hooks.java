package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("browser setting up");
    }

    @After
    public void tearDown() {
        System.out.println("browser tearing down");

    }



}
