package com.reliquias.software.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class NavegarPaginaWeb implements Task {

    private final String urlPaginaWeb;

    public static Performable usandoUrl(String urlPaginaWeb) {
        return instrumented(NavegarPaginaWeb.class, urlPaginaWeb);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(urlPaginaWeb));
    }
}
