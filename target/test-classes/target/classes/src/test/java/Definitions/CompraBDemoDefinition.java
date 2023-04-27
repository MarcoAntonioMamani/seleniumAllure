package test.java.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.Pages.BlazeDemo.ComprarPage;
import test.java.Pages.BlazeDemo.DetalleProductoPage;
import test.java.Pages.BlazeDemo.ListaProductosPage;
import test.java.Pages.BlazeDemo.MenuPage;

public class CompraBDemoDefinition {

     ListaProductosPage listaProductosPage=new ListaProductosPage();
     DetalleProductoPage detalleProductoPage=new DetalleProductoPage();
     ComprarPage comprarPage=new ComprarPage();
     MenuPage menuPage=new MenuPage();
    @Given("la pagina se encuentra estable")
    public void laPaginaEstaEstable() {
        Hooks.getDriver().get("https://www.demoblaze.com/");
    }

    @When("agregamos {string} al carrito de compras")
    public void agregamosAlCarritoDeCompras(String products) throws Exception {
        String[] product = products.split(",");
        for (int i = 0; i < product.length; i++) {
            listaProductosPage.agregarProductoCarrito(product[i]);
            detalleProductoPage.adiccionarProducto();
            menuPage.goToHome();
        }


    }

    @And("visualizamos el carrito")
    public void visualizamosElCarrito() throws Exception {
        menuPage.goToCart();
    }



    @And("Complementamos Formulario Carrito con {string}{string}{string}{string}{string}{string}")
    public void complementamosFormularioCarritoCon(String name, String country, String city, String creditCard, String month
            , String year) throws Exception {
     comprarPage.confirmarCompra(name,city,country,creditCard,month,year);


    }

    @Then("se desplegara el mensaje {string}")
    public void seDesplegaraElMensaje(String mensaje) throws Exception {
     comprarPage.validarCompraExitosa(mensaje);

    }
}
