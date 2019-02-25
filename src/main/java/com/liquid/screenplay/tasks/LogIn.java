package com.liquid.screenplay.tasks;

import com.liquid.screenplay.abilities.Authenticate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.liquid.screenplay.ui.SignInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    @Step("Logs in loaded {0}")
    public static LogIn withCredentials(){
        return instrumented(LogIn.class);
    }

    @Step
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue(authenticated(user).username())
                    .into(EMAIL_ADDRESS),
                Enter.theValue(authenticated(user).password())
                    .into(PASSWORD),
                Click.on(SIGN_IN_BTN)
        );
    }

    private Authenticate authenticated(Actor actor) {
       return Authenticate.as(actor);
    }

}
