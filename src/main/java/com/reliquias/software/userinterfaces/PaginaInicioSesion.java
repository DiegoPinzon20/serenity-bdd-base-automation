package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion {

    public static final Target USERNAME_FIELD = Target.the("Campo para ingresar el usuario").locatedBy("//input[@name = 'Username']");
    public static final Target PASSWORD_FIELD = Target.the("Campo para ingresar el password de acceso").locatedBy("//input[@id = 'StartSharp_Membership_LoginPanel0_Password']");
    public static final Target BUTTON_SIGN_IN = Target.the("Botón para acceder al sistema").locatedBy("//button[contains(text(), 'Sign In')]");

    private PaginaInicioSesion() {
    }

}
