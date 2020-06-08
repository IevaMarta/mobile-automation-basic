package screens;

import general.AppiumElement;
import io.appium.java_client.AppiumDriver;
import io.cucumber.datatable.DataTable;
import static general.Logger.info;
import java.util.Map;


import static org.assertj.core.api.Assertions.assertThat;

public class NikonD5600DigitalCamerasScreen extends BaseScreen {
 // Constructor
 public NikonD5600DigitalCamerasScreen(AppiumDriver driver) {
    super(driver);
    addElement("nikonD5600DigitalCamerasTitle", "xpath", "//*[@text='Nikon D5600 Digital Cameras']");
    addElement("nikonCameraFirstListItem", "xpath", "//android.widget.RelativeLayout[@resource-id='com.ebay.mobile:id/cell_collection_item']//android.widget.TextView");
  }

  // Base Methods
  @Override
  public AppiumElement getMainElement() {
    return getElement("nikonD5600DigitalCamerasTitle");
  }

  public void validateData(String scope, DataTable dataTable) {
    info(scope);
    switch(capitalizeSecond(scope)){
      case "digitalCamera": validateDigitalCamera(scope, dataTable); break;
      default: super.validateData(scope, dataTable);
    }
  }

  public void validateDigitalCamera(String scope, DataTable dataTable) {
    Map<String,String> data = dataTable.transpose().asMaps().get(0);
    info("Validating Digital camera: " + data);
    String elementText = getElement("nikonCameraFirstListItem").getText();

    if(data.get("Name") != null){
        assertThat(elementText.contains(data.get("Name"))).isTrue();
    }
  }
    
}