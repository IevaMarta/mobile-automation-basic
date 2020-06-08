package screens;

import general.AppiumElement;
import general.ScreenManager;
import io.appium.java_client.AppiumDriver;

public class NikonDigitalCamerasScreen extends BaseScreen {

  // Constructor
  public NikonDigitalCamerasScreen(AppiumDriver driver) {
    super(driver);
    addElement("nikonDigitalCamerasTitle", "xpath", "//*[@text='Nikon Digital Cameras']");
    addElement("nikonD", "xpath", "//*[@text='Nikon D']");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement() {
    return getElement("nikonDigitalCamerasTitle");
  }

  @Override
  public void navigate(String element){
    switch (element){
      case "nikonD" : ScreenManager.setCurrentPage(ScreenManager.getNikonDDigitalCameraScreen()); break;
      default          : super.navigate(element);
    }
  }
    
}