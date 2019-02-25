package com.liquid.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.liquid.com/sign-in")
public class SignInPage  extends PageObject {
    public static Target EMAIL_ADDRESS = Target.the("Email Address field").locatedBy("#sign-in--1--email");
    public static Target PASSWORD = Target.the("Password field").locatedBy("#sign-in--1--password--text");
    public static Target SIGN_IN_BTN = Target.the("Sign In Button").locatedBy("#sign-in--1--submit");

}
