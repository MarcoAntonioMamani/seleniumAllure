package test.java.Uix.BlazeDemo;

import org.openqa.selenium.By;

public class ListaProductoUix {

    public static By lnkProduct(String nameProduct){
        return By.xpath("//a[contains(text(), '"+nameProduct+"')]");
    }
}
