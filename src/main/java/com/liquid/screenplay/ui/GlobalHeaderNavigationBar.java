package com.liquid.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class GlobalHeaderNavigationBar extends PageObject {

    public static Target TOP_MENU_BTN = Target.the("Top Menu Button").locatedBy("#top-menu--button");
}
