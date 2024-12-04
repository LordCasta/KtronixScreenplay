package com.ktronix.tasks;

import com.ktronix.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.userInterface.CategoriaUI.*;
import static com.ktronix.userInterface.ProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AñadirCarritoTask implements Task {

    private String producto;

    public AñadirCarritoTask(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                WaitUntil.the(TXT_PRODUCTO.of(producto), isVisible()).forNoMoreThan(150).seconds(),
                ScrollJavaScript.to(TXT_PRODUCTO.of(producto)),
                Click.on(TXT_PRODUCTO.of(producto)),
                ScrollJavaScript.to(BTN_AGREGARCARRITO),
                Click.on(BTN_AGREGARCARRITO),
                WaitUntil.the(BTN_IRCARRITO, isVisible()).forNoMoreThan(150).seconds(),
                Click.on(BTN_IRCARRITO)
        );

    }

    public static AñadirCarritoTask conElProducto(String producto){
        return new AñadirCarritoTask(producto);
    }

}
