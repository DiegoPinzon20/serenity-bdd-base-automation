package com.reliquias.software.stepdefinitions;

import com.reliquias.software.interactions.IngresarCredenciales;
import com.reliquias.software.models.UsuarioGenerico;
import com.reliquias.software.questions.TituloPaginaPrincipal;
import com.reliquias.software.tasks.IniciarSesion;
import com.reliquias.software.tasks.NavegarPaginaWeb;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static com.reliquias.software.utils.UrlPaginaWeb.PAGINA_INICIO_SESION_STARTSHARP;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginStepDefinitions {

    @Dado("{actor} navega a la página de inicio de sesión")
    public void usuarioNavegaPaginaDeInicioSesion(Actor actor) {
        String cadenaVacia = "";
        actor.wasAbleTo(
                NavegarPaginaWeb.usandoUrl(PAGINA_INICIO_SESION_STARTSHARP.getUrl()),
                IngresarCredenciales.conModelo(UsuarioGenerico.builder()
                        .user(cadenaVacia)
                        .password(cadenaVacia).build()));
    }

    @Cuando("incia sesión con las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAcceso() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.paraUsuario(UsuarioGenerico.builder()
                        .user("admin")
                        .password("serenity").build()));
    }

    @Entonces("debería ver el tablero en la página principal")
    public void deberiaVerTableroPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(TituloPaginaPrincipal.valor(), equalToIgnoringCase("dashboard"))
        );
    }
}
