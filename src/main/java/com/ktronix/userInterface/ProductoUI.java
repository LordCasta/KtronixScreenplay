package com.ktronix.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {

    public static final Target BTN_AGREGARCARRITO = Target.the("Boton añadir a carrito")
            .locatedBy("//button[@id='addToCartButton']");

    public static final Target BTN_IRCARRITO = Target.the("Boton para ir al carrito")
            .locatedBy("//div[@class='modal-footer']/a[@href='/cart']");



    private ProductoUI(){
        throw new UnsupportedOperationException("Utility class");
    }

}
