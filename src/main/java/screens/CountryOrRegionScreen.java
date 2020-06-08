package screens;

import general.AppiumElement;
import io.appium.java_client.AppiumDriver;
import static general.Logger.info;

public class CountryOrRegionScreen extends BaseScreen {
  // Constructor
  public CountryOrRegionScreen(AppiumDriver driver) {
    super(driver);
    addElement("countryOrRegionTitle", "xpath", "//*[@text='Country or region']");
    addElement("switchWidget", "id", "switchWidget");
    addElement("searchField", "id", "filter");
    addElement("unitedStates", "xpath", "//*[@text='United States']");
    addElement("swaziland", "xpath", "//*[@text='Swaziland']");
    addElement("sweden", "xpath", "//*[@text='Sweden']");
    addElement("switzerland", "xpath", "//*[@text='Switzerland']");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement(){
    return getElement("countryOrRegionTitle");
  }

  // Methods
  public void searchFor(String string){
    info("Searching for '" + string + "'");
    getElement("searchField").find(getTimeout()).sendKeys(string);
  }
}