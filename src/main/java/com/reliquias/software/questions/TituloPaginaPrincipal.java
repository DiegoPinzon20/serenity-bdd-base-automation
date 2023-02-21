package com.reliquias.software.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reliquias.software.userinterfaces.MenuPaginaPrincipal.TITLE_MAIN_PAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Subject("the displayed title in main page - dashboard")
public class TituloPaginaPrincipal implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE_MAIN_PAGE, isVisible()).forNoMoreThan(30).seconds());
        return Text.of(TITLE_MAIN_PAGE).answeredBy(actor);
    }

    public static Question<String> valor() {
        return new TituloPaginaPrincipal();
    }
}
