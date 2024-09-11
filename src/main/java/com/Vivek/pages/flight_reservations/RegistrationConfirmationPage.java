package com.Vivek.pages.flight_reservations;

import com.Vivek.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationConfirmationPage extends AbstractPage {

    @FindBy(id = "go-to-flights-search")
    private WebElement goToFlightsSearchButton;

    public RegistrationConfirmationPage(WebDriver driver){
        super(driver);
    }

    public void goToFlightsSearch(){
        this.goToFlightsSearchButton.click();
    }

    @Override
    public boolean isAt(){
        this.wait.until((ExpectedConditions.visibilityOf(this.goToFlightsSearchButton)));
        return this.goToFlightsSearchButton.isDisplayed();
    }
}
