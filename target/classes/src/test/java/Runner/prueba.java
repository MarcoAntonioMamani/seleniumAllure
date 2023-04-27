package test.java.Runner;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;


public class prueba {
    public static void main(String[] args) {
        System.out.println("Inreso al Mainnnnn");
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        String path=System.getProperty("user.dir")+"\\testng.xml";
       path=System.getProperty("user.dir")+"\\src\\test\\resources\\testng.xml";
     //   path=System.getProperty("user.dir")+"\\classes\\testng.xml";
        System.out.println("Dir:"+path);
        suites.add("testng.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
