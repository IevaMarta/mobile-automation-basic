package screens;

import general.AppiumElement;
import io.appium.java_client.AppiumDriver;
import general.ScreenManager;

public class SettingsScreen extends BaseScreen {
  // Constructor
  public SettingsScreen(AppiumDriver driver) {
    super(driver);
    addElement("settingsTitle", "xpath", "//*[@text='Settings']");
    addElement("countryOrRegion", "xpath", "//*[@text='Country or region']");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement(){
    return getElement("settingsTitle");
  }

  @Override
  public void navigate(String element){
    switch (element){
      case "countryOrRegion" : ScreenManager.setCurrentPage(ScreenManager.getCountryOrRegionScreen());break;
      default          : super.navigate(element);
    }
  }

}
