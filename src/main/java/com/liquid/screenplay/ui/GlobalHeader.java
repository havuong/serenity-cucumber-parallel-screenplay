package com.liquid.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GlobalHeader extends PageObject {

    private static Target SIGN_IN_BTN = Target.the("Sign In Button").locatedBy("#guest--sign-in");
    private static Target SIGN_UP_BTN = Target.the("Sign Up button").locatedBy("#guest--sign-up");

    public static Target getLoginScreen() {
//        if (RunEnvironment.ofValue() == RunEnvironment.Mobile)
//        {
//            GET_LOGIN_SCREEN = Target.the("Mobile Sign In Button")
//                    .locatedBy("#_mobile_user_info > div > a");
//        }
        return SIGN_IN_BTN;
    }
}
