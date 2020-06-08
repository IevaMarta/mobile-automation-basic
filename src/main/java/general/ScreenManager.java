package general;

import io.appium.java_client.AppiumDriver;
import screens.*;

public class ScreenManager {
  // Variables
  private static AppiumDriver driver;
  private static BaseScreen currentScreen;
  private static HomeScreen homeScreen;
  private static SearchScreen searchScreen;
  private static SignInScreen signInScreen;
  private static ProductScreen productScreen;
  private static SearchResultsScreen searchResultsScreen;
  private static ProductOptionsScreen productOptionsScreen;
  private static CategoriesScreen categoriesScreen;
  private static CreateAnAccountScreen createAnAccountScreen;
  private static RegisterScreen registerScreen;
  private static DigitalCamerasScreen digitalCamerasScreen;
  private static NikonDigitalCamerasScreen nikonDigitalCamerasScreen;
  private static NikonDDigitalCameraScreen nikonDDigitalCameraScreen;
  private static NikonD5600DigitalCamerasScreen nikonD5600DigitalCamerasScreen;
  private static SettingsScreen settingsScreen;
  private static CountryOrRegionScreen countryOrRegionScreen;

  // Methods
  public static void initPages(){
    homeScreen = new HomeScreen(driver);
    searchScreen = new SearchScreen(driver);
    signInScreen = new SignInScreen(driver);
    productScreen = new ProductScreen(driver);
    searchResultsScreen = new SearchResultsScreen(driver);
    productOptionsScreen = new ProductOptionsScreen(driver);
    categoriesScreen = new CategoriesScreen(driver);
    createAnAccountScreen = new CreateAnAccountScreen(driver);
    registerScreen = new RegisterScreen(driver);
    digitalCamerasScreen = new DigitalCamerasScreen(driver);
    nikonDigitalCamerasScreen = new NikonDigitalCamerasScreen(driver);
    nikonDDigitalCameraScreen = new NikonDDigitalCameraScreen(driver);
    nikonD5600DigitalCamerasScreen = new NikonD5600DigitalCamerasScreen(driver);
    settingsScreen = new SettingsScreen(driver);
    countryOrRegionScreen = new CountryOrRegionScreen(driver);
  }
  public static void setDriver(AppiumDriver driver){
    ScreenManager.driver = driver;
    initPages();
  }
  public static void setCurrentPage(BaseScreen page){
    currentScreen = page;
    ScreenManager.getCurrentScreen().validatePage();
  }
  public static BaseScreen getCurrentScreen(){
    return currentScreen;
  }
  // Screen getters
  public static HomeScreen getHomeScreen(){
    return homeScreen;
  }
  public static SearchScreen getSearchScreen(){
    return searchScreen;
  }
  public static ProductScreen getProductScreen() { return productScreen; }
  public static SearchResultsScreen getSearchResultsScreen() { return searchResultsScreen; }
  public static ProductOptionsScreen getProductOptionsScreen() { return productOptionsScreen; }
  public static SignInScreen getSignInScreen() { return signInScreen; }
  public static CategoriesScreen getCategoriesScreen() { return categoriesScreen; }
  public static CreateAnAccountScreen getCreateAnAccountScreen() { return createAnAccountScreen; }
  public static RegisterScreen getRegisterScreen() { return registerScreen; }
  public static DigitalCamerasScreen getDigitalCamerasScreen() {return digitalCamerasScreen; }
  public static NikonDigitalCamerasScreen getNikonDigitalCamerasScreen() {return nikonDigitalCamerasScreen; }
  public static NikonDDigitalCameraScreen getNikonDDigitalCameraScreen() {return nikonDDigitalCameraScreen; }
  public static NikonD5600DigitalCamerasScreen getNikonD5600DigitalCamerasScreen() {return nikonD5600DigitalCamerasScreen; }
  public static SettingsScreen getSettingsScreen() {return settingsScreen; }
  public static CountryOrRegionScreen getCountryOrRegionScreen() {return countryOrRegionScreen; }
}
