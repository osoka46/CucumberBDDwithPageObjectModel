package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchLocators {

    @FindBy(how = How.ID,using = "makes")
    public WebElement selectBrand;
    @FindBy(how = How.ID,using="models")
    public WebElement selectModel;


    @FindBy(how = How.ID,using="locations")
    public WebElement Location;

    @FindBy(how = How.ID,using="priceTo")
    public WebElement Price;


    @FindBy(how = How.ID,using = "search-submit")
    public WebElement findMyNextCarButton;

}
