package com.ktronix.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static com.ktronix.userInterface.CarritoUI.LBL_VALIDAR_PRECIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidarPrecioCarrito implements Task {

    private String precio;

    public ValidarPrecioCarrito(String precio){
        this.precio = precio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_VALIDAR_PRECIO, isPresent()).forNoMoreThan(150).seconds()
        );

        String lbl_validar = LBL_VALIDAR_PRECIO.resolveFor(actor).getText();

        Assert.assertTrue("El precio no coincide", lbl_validar.contains(precio));

    }

    public static ValidarPrecioCarrito conElPrecio(String precio){
        return new ValidarPrecioCarrito(precio);
    }

}
