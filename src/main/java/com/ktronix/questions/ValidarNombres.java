package com.ktronix.questions;

import com.ktronix.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

import static com.ktronix.userInterface.FacturacionUI.TXT_VALIDAR_NOMBRE;

public class ValidarNombres implements Task {

    private String nombres;

    public ValidarNombres(String nombres){
        this.nombres = nombres;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ScrollJavaScript.to(TXT_VALIDAR_NOMBRE)
        );

        String lst_validar = TXT_VALIDAR_NOMBRE.resolveFor(actor).getText();

        Assert.assertTrue("El texto nombres no coincide", lst_validar.contains(nombres));

    }

    public static ValidarNombres conLaCiudad(String nombres){
        return new ValidarNombres(nombres);
    }


}
