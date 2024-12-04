package com.ktronix.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static com.ktronix.userInterface.CarritoUI.LBL_VALIDAR_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidarProductoCarrito implements Task {

    private String producto;

    public ValidarProductoCarrito(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_VALIDAR_CARRITO, isPresent()).forNoMoreThan(150).seconds()
        );

        String lbl_validar = LBL_VALIDAR_CARRITO.resolveFor(actor).getText();

        Assert.assertEquals("El texto producto no coincide", lbl_validar, producto);

    }

    public static ValidarProductoCarrito conElProducto(String producto){
        return new ValidarProductoCarrito(producto);
    }
}
