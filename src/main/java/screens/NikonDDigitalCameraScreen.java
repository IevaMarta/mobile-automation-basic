package screens;

import general.AppiumElement;
import general.ScreenManager;
import io.appium.java_client.AppiumDriver;

public class NikonDDigitalCameraScreen extends BaseScreen {

  // Constructor
  public NikonDDigitalCameraScreen(AppiumDriver driver) {
    super(driver);
    addElement("nikonDDigitalCameraTitle", "xpath", "//*[@text='Nikon D Digital Camera']");
    addElement("nikonD5600", "xpath", "//*[@text='Nikon D5600']");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement() {
    return getElement("nikonDDigitalCameraTitle");
  }

  @Override
  public void navigate(String element){
    switch (element){
      case "nikonD5600" : ScreenManager.setCurrentPage(ScreenManager.getNikonD5600DigitalCamerasScreen()); break;
      default          : super.navigate(element);
    }
  }
}
    
