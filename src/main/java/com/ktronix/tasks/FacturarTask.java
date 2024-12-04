package com.ktronix.tasks;

import com.ktronix.exceptions.FacturacionInaccesibleException;
import com.ktronix.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.ktronix.userInterface.CarritoUI.BTN_SEGUIR_PAGO;
import static com.ktronix.userInterface.FacturacionUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FacturarTask implements Task {

    private String producto;
    private String correo;
    private String nombres;
    private String apellidos;
    private String celular;
    private String documento;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String barrio;

    public FacturarTask(String producto, String correo, String nombres, String apellidos, String celular,  String documento, String departamento, String ciudad, String direccion, String barrio){
        this.producto = producto;
        this.correo = correo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.documento = documento;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.barrio = barrio;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_SEGUIR_PAGO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SEGUIR_PAGO),
                Enter.keyValues(correo).into(IPT_CORREO).thenHit(Keys.ENTER)
        );

        if(!IPT_NOMBRES.resolveFor(actor).isPresent()){
            throw new FacturacionInaccesibleException("El formulario es inaccesible, cambiar el correo de uso");
        }

        actor.attemptsTo(
                Enter.keyValues(nombres).into(IPT_NOMBRES),
                Enter.keyValues(apellidos).into(IPT_APELLIDOS),
                Enter.keyValues(celular).into(IPT_CELULAR),
                Click.on(CHK_AUTORIZO),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(IPT_DOCUMENTO, isVisible()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(LST_DOCUMENTO),
                ScrollJavaScript.to(IPT_DOCUMENTO),
                Enter.keyValues(documento).into(IPT_DOCUMENTO),
                JavaScriptClick.on(LST_DEPARTAMENTO.of(departamento)),
                Enter.keyValues(direccion).into(IPT_DIRECCION),
                Enter.keyValues(barrio).into(IPT_BARRIO)
        );



    }

    public static FacturarTask conElProducto(String producto, String correo,  String nombres, String apellidos, String celular,  String documento, String departamento, String ciudad, String direccion, String barrio){
        return new FacturarTask(producto, correo, nombres, apellidos, celular, documento, departamento, ciudad, direccion, barrio);
    }

}
