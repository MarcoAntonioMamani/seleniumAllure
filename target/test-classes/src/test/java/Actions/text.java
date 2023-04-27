package test.java.Actions;

import org.openqa.selenium.By;
import test.java.Definitions.Hooks;

public class text {
    public static void set(By locator, String text) throws Exception {
       Hooks.driver.findElement(locator).sendKeys(text);
    }
    public static String get(By locator) throws Exception {
       return  Hooks.driver.findElement(locator).getText();
    }
}
