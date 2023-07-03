package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.CarsGuideHomePageLocators;
import pages.locators.UsedCarsSearchLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
    UsedCarsSearchLocators usedCarsSearchLocators = null;


    public UsedCarsSearchPageActions() {
        this.usedCarsSearchLocators = new UsedCarsSearchLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchLocators);
    }

    public void selectCars(String carBrand) {
        Select selectCarBrand = new Select(usedCarsSearchLocators.selectBrand);
        selectCarBrand.selectByVisibleText(carBrand);

    }

    public void selectModel(String model) {
        Select selectCarBrand = new Select(usedCarsSearchLocators.selectModel);
        selectCarBrand.selectByVisibleText(model);

    }

    public void selectLocation(String location) {
        Select selectCarBrand = new Select(usedCarsSearchLocators.Location);
        selectCarBrand.selectByVisibleText(location);


    }

    public void selectMaxPrice(String price) {
        Select selectCarBrand = new Select(usedCarsSearchLocators.Price);
        selectCarBrand.selectByVisibleText(price);

    }

    public void clickFindMyNextCar() {
        usedCarsSearchLocators.findMyNextCarButton.click();
    }


}
