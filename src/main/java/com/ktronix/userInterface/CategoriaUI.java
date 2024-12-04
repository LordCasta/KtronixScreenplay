package com.ktronix.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriaUI {

    public static final Target LBL_MARCA = Target.the("Boton para acceder a productos")
            .locatedBy("//img[@alt='Logo de Samsung']");

    public static final Target BTN_FILTRO = Target.the("Boton checkbox de filtro de tipo de celular")
            .locatedBy("//input[@value='Galaxy S24 Ultra']");

    public static final Target TXT_PRODUCTO = Target.the("Texto para seleccionar el producto")
            .locatedBy("//h3[contains(text(),'{0}')]");

    private CategoriaUI(){
        throw new UnsupportedOperationException("Utility class");
    }
}
