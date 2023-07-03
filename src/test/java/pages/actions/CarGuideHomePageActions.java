package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarGuideHomePageActions {
    CarsGuideHomePageLocators carsGuideHomePageLocators = null;


    public CarGuideHomePageActions() {
        this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
    }

    public void moveToBuySellMenu() {
        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.moveToElement(carsGuideHomePageLocators.buySellLink).perform();

    }

    public void clickToSearchCarsMenu() {
        //moveToBuySellMenu
        carsGuideHomePageLocators.searchCarsLInk.click();

    }

    public void clickToUsedCarLink() {
        //moveToBuySellMenu
        carsGuideHomePageLocators.usedCarLink.click();


    }

}
