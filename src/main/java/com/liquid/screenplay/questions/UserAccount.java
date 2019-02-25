package com.liquid.screenplay.questions;

import com.liquid.screenplay.model.UserAccountInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UserAccount implements Question<UserAccountInformation> {

    @Override
    public UserAccountInformation answeredBy(Actor actor) {
        String title = BrowseTheWeb.as(actor).getTitle();
        return new UserAccountInformation(title);
    }

    public static UserAccount loaded(){
        return new UserAccount();
    }
}
