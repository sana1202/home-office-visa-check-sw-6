package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']")
    WebElement resultText;

    public String getResultMessage(){
        log.info("Get result text displayed: " + resultText.toString());
        return getTextFromElement(resultText);
    }

    public void confirmResultMessage(String expectedMessage) {
        log.info("Verify result text displayed: " + resultText.toString());
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }
}
