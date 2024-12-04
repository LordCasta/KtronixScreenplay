package com.ktronix.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target LBL_VALIDAR_CARRITO = Target.the("Label del producto en carrito")
            .locatedBy("//div[@class='item-column item__info']/a/span[@class='item__name']");

    public static final Target LBL_VALIDAR_PRECIO = Target.the("Validar precio del producto")
            .locatedBy("//div[@class='col-xs-6 no-padding cart-totals-right text-right grand-total mycart mycart__title mycart--bold js-cart-total']");

    public static final Target BTN_SEGUIR_PAGO = Target.the("Botón para seguir con el pago")
            .locatedBy("//button[@id='js-go-to-pay']");

    private CarritoUI(){
        throw new UnsupportedOperationException("Utility class");
    }
}
