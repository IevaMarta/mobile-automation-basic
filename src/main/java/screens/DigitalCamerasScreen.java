package screens;

import general.AppiumElement;
import general.ScreenManager;
import io.appium.java_client.AppiumDriver;

public class DigitalCamerasScreen extends BaseScreen {
  
  // Constructor
  public DigitalCamerasScreen(AppiumDriver driver) {
    super(driver);
    addElement("digitalCamerasTitle", "xpath", "//*[@text='Digital Cameras']");
    addElement("nikon", "xpath", "//*[@text='Nikon']");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement() {
    return getElement("digitalCamerasTitle");
  }

  @Override
  public void navigate(String element){
    switch (element){
      case "nikon" : ScreenManager.setCurrentPage(ScreenManager.getNikonDigitalCamerasScreen()); break;
      default          : super.navigate(element);
    }
  }
}