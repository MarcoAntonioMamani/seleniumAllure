package test.java.Pages.BlazeDemo;


import test.java.Actions.click;

import static test.java.Uix.BlazeDemo.MenuUix.*;


public class MenuPage {

public void goToHome() throws Exception {
    click.on(lnkHome);
}
public void goToCart() throws Exception {
    click.on(lnkCart);
}
}
