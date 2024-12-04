package com.ktronix.tasks;

import com.ktronix.exceptions.CategoriaNoEncontradaException;
import com.ktronix.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.ktronix.userInterface.CategoriaUI.*;
import static com.ktronix.userInterface.HomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoTask implements Task {

    private String categoria;


    public BuscarProductoTask(String categoria){
        this.categoria = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(BTN_CATEGORIA.of(categoria)),
                ScrollJavaScript.to(LBL_MARCA),
                Click.on(LBL_MARCA),
                ScrollJavaScript.to(BTN_FILTRO),
                Click.on(BTN_FILTRO)

        );
        if (!BTN_CATEGORIA.of(categoria).resolveFor(actor).isPresent()) {
            throw new CategoriaNoEncontradaException("No se encuentra la categoria a buscar");
        }

    }

    public static BuscarProductoTask conLaCategoria(String categoria){
        return new BuscarProductoTask(categoria);
    }

}
