package com.liquid.screenplay.tasks;

import com.liquid.screenplay.ui.MarketsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;
import com.liquid.screenplay.actions.Refresh;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private Performable steps;
    private String title;

    MarketsPage onMarketsPage;

    @Step("{0} starts and performs the step **#title**")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(onMarketsPage),
                Refresh.theBrowserSession()
               , Check.whether(steps != null).andIfSo(Task.where(title, steps))
        );
    }

    public static Start prepareToSignIn() {
        return instrumented(Start.class, "Go to Login Screen", GoToLoginPage.called());
    }

    public Start(String title, Performable steps) {
        this.title = title;
        this.steps = steps;
    }
}
