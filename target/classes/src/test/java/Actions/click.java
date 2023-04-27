package test.java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import test.java.Definitions.Hooks;

public class click {
    public static void on (By locator) throws Exception {
        waitUntilElement.isPresent(locator);
        Hooks.driver.findElement(locator).click();
    }

}
