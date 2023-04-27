package test.java.Uix.BlazeDemo;

import org.openqa.selenium.By;

public class ComprarUix {
    public static By btnOrder=By.xpath("//button[contains(text(), 'Place Order')]");
    public static By txtName=By.id("name");
    public static By txtCountry=By.id("country");
    public static By txtCity=By.id("city");
    public static By txtCreditCard=By.id("card");
    public static By txtMonth=By.id("month");
    public static By txtYear=By.id("year");
    public static By btnPurchase=By.xpath("//button[contains(text(), 'Purchase')]");
    public static By txtConfirmacion=By.xpath("//div[10]/h2");

}
