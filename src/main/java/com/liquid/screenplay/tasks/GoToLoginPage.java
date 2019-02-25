package com.liquid.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.liquid.screenplay.ui.GlobalHeader.getLoginScreen;

public class GoToLoginPage {

     public static Task called () {
       return Task.where("Go To Login screen",
               Click.on(getLoginScreen()));
    }
}
