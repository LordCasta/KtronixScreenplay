package com.ktronix.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FacturacionUI {

    public static final Target IPT_CORREO = Target.the("Input correo")
            .locatedBy("//input[@id='j_username']");

    public static final Target IPT_NOMBRES = Target.the("Input nombres")
            .locatedBy("//input[@id='firstName']");

    public static final Target IPT_APELLIDOS = Target.the("input apellidos")
            .locatedBy("//input[@id='lastName']");

    public static final Target IPT_CELULAR = Target.the("Input celular")
            .locatedBy("//input[@id='phone']");

    public static final Target CHK_AUTORIZO = Target.the("Checkbox de consentimiento")
            .locatedBy("//label[@class='form-check-label']");

    public static final Target BTN_CONTINUAR = Target.the("Boton para continuar pago")
            .locatedBy("//button[@id='js-buttonSignIn']");

    public static final Target LST_DOCUMENTO = Target.the("Lista tipo de documento")
            .locatedBy("//div[@class='float-select--list js-float-list']//li[@data-value='CC']");

    public static final Target IPT_DOCUMENTO = Target.the("Input documento")
            .locatedBy("//input[@id='address.idNumber']");

    public static final Target LST_DEPARTAMENTO = Target.the("Lista departamentos")
            .locatedBy("//div[@class='float-select js-float-select js-float-group']//li[contains(text(),'{0}')]");

    public static final Target TXT_VALIDAR_NOMBRE = Target.the("Lista para validar ciudad")
            .locatedBy("//div[@class='fullNameFirstStep']/p");

    public static final Target IPT_DIRECCION = Target.the("Input de direccion")
            .locatedBy("//input[@id='addressLine1']");

    public static final Target IPT_BARRIO = Target.the("Input de barrio")
            .locatedBy("//input[@id='addressDistrict']");

    private FacturacionUI() {
        throw new UnsupportedOperationException("Utility class");
    }

}
