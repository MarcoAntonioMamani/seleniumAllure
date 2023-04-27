package test.java.Pages.BlazeDemo;


import org.testng.Assert;
import test.java.Actions.click;
import test.java.Actions.text;
import test.java.Actions.waitUntilElement;

import static test.java.Uix.BlazeDemo.ComprarUix.*;


public class ComprarPage {


    public void confirmarCompra(String name, String country, String city, String creditCard, String month
            , String year) throws Exception {
        click.on(btnOrder);
        Assert.assertTrue(waitUntilElement.isPresent(txtName),"El campo Nombre no es visible");
        text.set(txtName,name);
        text.set(txtCountry,country);
        text.set(txtCity,city);
        text.set(txtCreditCard,creditCard);
        text.set(txtMonth,month);
        text.set(txtYear,year);
        click.on(btnPurchase);
    }

    public void validarCompraExitosa(String mensaje) throws Exception {
        Assert.assertTrue(waitUntilElement.isPresent(txtConfirmacion),"Text de confirmacion no es visible");
        Assert.assertEquals(mensaje,text.get(txtConfirmacion));
    }
}
