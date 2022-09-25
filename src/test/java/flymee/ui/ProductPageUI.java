package flymee.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPageUI {
    public static Target HYPER_LINK(String name) {
        return Target.the("Hyper links")
                .located(By.linkText(name));
    }

    public static Target BTN_CART = Target.the("button cart")
            .locatedBy("//*[@class='icon_cart']");

    public static Target BTN_FAVOURITE = Target.the("button favourite")
            .locatedBy("//*[@class='favorite']");

    public static Target BTN_ADD_TO_CART = Target.the("Button add to cart")
            .locatedBy("//div[@id='js-cartIn']");

    public static Target ICON_FAVOURITE = Target.the("Add to favourite")
            .locatedBy("//div[contains(@class,'fav_icon')]");

    public static Target ICON_FAVOURITE_ACTIVE = Target.the("Add to favourite successfully")
            .locatedBy("//*[contains(@class,'fav_icon js-addFavorite _active')]");

    public static Target TXT_QUANTITY = Target.the("text box quantity")
            .locatedBy("//*[contains(@class,'quantity')]//*[@type='text']");

    public static Target ICON_PLUS = Target.the("plus icon")
            .locatedBy("//*[contains(@class,'plus')]");

    public static Target DDL_PLUS = Target.the("drop down plus")
            .locatedBy("//*[contains(@class,'select')]");

    public static Target HAMBURGER_MENU = Target.the("Hamburger menu")
            .locatedBy("//span[@class='menu_icon']");
}
