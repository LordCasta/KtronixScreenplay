package com.ktronix.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target BTN_CATEGORIA = Target.the("Boton para abrir la ventana la categoria")
            .locatedBy("//a[@title='{0}']");


    private HomeUI(){
        throw new UnsupportedOperationException("Utility class");
    }
}
