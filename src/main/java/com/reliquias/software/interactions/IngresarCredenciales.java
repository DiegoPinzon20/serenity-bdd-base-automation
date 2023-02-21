package com.reliquias.software.interactions;

import com.reliquias.software.models.UsuarioGenerico;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.reliquias.software.userinterfaces.PaginaInicioSesion.PASSWORD_FIELD;
import static com.reliquias.software.userinterfaces.PaginaInicioSesion.USERNAME_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCredenciales implements Interaction {

    private final String user;
    private final String password;

    public IngresarCredenciales(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    @Step("#actor ingresa las credenciales")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD)
        );
    }

    public static Performable conModelo(UsuarioGenerico usuarioGenerico) {
        return instrumented(IngresarCredenciales.class, usuarioGenerico.getUser(), usuarioGenerico.getPassword());
    }
}
