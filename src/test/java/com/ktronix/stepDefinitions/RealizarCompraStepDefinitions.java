package com.ktronix.stepDefinitions;

import com.ktronix.questions.ValidarNombres;
import com.ktronix.questions.ValidarPrecioCarrito;
import com.ktronix.questions.ValidarProductoCarrito;
import com.ktronix.tasks.AñadirCarritoTask;
import com.ktronix.tasks.BuscarProductoTask;
import com.ktronix.tasks.FacturarTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RealizarCompraStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la pagina {string}")
    public void queMeEncuentroEnLaPagina(String url) {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        theActorCalled("robot").wasAbleTo(Open.url(url));
    }
    @Cuando("Seleccione categoria {string}")
    public void seleccioneCategoria(String categoria) {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                    BuscarProductoTask.conLaCategoria(categoria)

                );
    }
    @Cuando("escoja el producto {string} con precio {string}")
    public void escojaElProducto(String producto, String precio) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        AñadirCarritoTask.conElProducto(producto),
                        ValidarPrecioCarrito.conElPrecio(precio)
                );
    }
    @Entonces("Visualizo la ventana de compra con el producto {string} correo {string} nombres {string} apellidos {string} celular {string} documento {string} departamento {string} ciudad {string} direccion {string} barrio {string}")
    public void visualizoLaVentanaDeCompraConElProducto(String producto, String correo, String nombres, String apellidos, String celular, String documento, String departamento, String ciudad, String direccion, String barrio) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ValidarProductoCarrito.conElProducto(producto),
                        FacturarTask.conElProducto(producto, correo, nombres, apellidos, celular, documento, departamento, ciudad, direccion, barrio),
                        ValidarNombres.conLaCiudad(nombres)
                );
    }

}
