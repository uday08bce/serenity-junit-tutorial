package serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.runner.Runwith;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventory;
    @Test
    public void usersCanLogOnViaTheHomepage(){

        login.loginAsAStandarduser();


        assertThat(inventory.getHeading()).
                isEqualToIgnoringCase("products");
    }
}
