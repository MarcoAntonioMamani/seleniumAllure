package test.java.Pages.BlazeDemo;

import org.testng.Assert;
import test.java.Actions.click;
import test.java.Actions.waitUntilElement;

import static test.java.Uix.BlazeDemo.ListaProductoUix.lnkProduct;

public class ListaProductosPage {


  public void agregarProductoCarrito(String product) throws Exception {

      Assert.assertTrue((waitUntilElement.isPresent(lnkProduct(product))),"El producto "+product+" no ha sido encontrado");
      click.on(lnkProduct(product));
  }
}
