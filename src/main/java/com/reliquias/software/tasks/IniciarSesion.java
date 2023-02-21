package com.reliquias.software.tasks;

import com.reliquias.software.interactions.IngresarCredenciales;
import com.reliquias.software.models.UsuarioGenerico;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.reliquias.software.userinterfaces.PaginaInicioSesion.BUTTON_SIGN_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class IniciarSesion implements Task {

    private final UsuarioGenerico usuarioGenerico;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarCredenciales.conModelo(usuarioGenerico),
                Click.on(BUTTON_SIGN_IN));
    }

    public static Performable paraUsuario(UsuarioGenerico usuarioGenerico) {
        return instrumented(IniciarSesion.class, usuarioGenerico);
    }
}
