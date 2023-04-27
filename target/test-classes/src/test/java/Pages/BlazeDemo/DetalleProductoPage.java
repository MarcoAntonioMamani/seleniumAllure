package test.java.Pages.BlazeDemo;

import org.openqa.selenium.Alert;
import test.java.Actions.click;
import test.java.Definitions.Hooks;

import static test.java.Uix.BlazeDemo.DetalleProductoUix.btnCart;


public class DetalleProductoPage {

    public void adiccionarProducto() throws Exception {
        click.on(btnCart);
        confirmar();
    }
    public void confirmar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Alert MensajeAlerta;
        MensajeAlerta= Hooks.driver.switchTo().alert();
        System.out.println("El mensaje de la alerta es: "+MensajeAlerta.getText());
        MensajeAlerta.accept();
    }
}
