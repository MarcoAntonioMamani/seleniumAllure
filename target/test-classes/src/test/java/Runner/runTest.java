package test.java.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.java.Support.UtilsBrowser;

import java.io.IOException;

@Test
@CucumberOptions(plugin = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        tags = "",
        features = "src/test/resources/features",
        glue = "test.java.Definitions")

public class runTest  extends AbstractTestNGCucumberTests {

    @Parameters({ "BrowserType" })
    @BeforeTest
    public static void setUpScenario(String browser) {
        UtilsBrowser.Browser=browser;
    }

    @AfterSuite
    public static void finish() throws IOException {
        /*try{
            System.out.println("Generando el Reporte");
            String [] cmd={"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado Correctamente");

        }catch (Exception ex){
            ex.printStackTrace();
        }*/

        try{
            System.out.println("Generando el Reporte");
            String [] cmd={"powershell.exe","/","allure serve"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado Correctamente");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
