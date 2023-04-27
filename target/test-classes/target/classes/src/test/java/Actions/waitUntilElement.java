package test.java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.Definitions.Hooks;

import java.time.Duration;

import static java.time.Duration.*;

public class waitUntilElement {
    public static boolean isPresent( By locator) throws Exception {

        try {
            WebDriverWait wait = new WebDriverWait(Hooks.driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
