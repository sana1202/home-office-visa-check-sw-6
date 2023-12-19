package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getTypeName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> stay;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String lengthOfStay){
       log.info("Select Stay Time Length: " + stay.toString());
        switch(lengthOfStay){
            case "6 months or less":
                stay.get(0).click();
                break;
            case "longer than 6 months":
                stay.get(1).click();
                break;
        }

    }
    public void clickNextStepButton(){
        log.info("Click on next step:");
        clickOnElement(continueButton);

    }

}
