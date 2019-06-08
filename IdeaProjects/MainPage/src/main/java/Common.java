

public class Common {
    public static webDriver driver;

public void openbrowser()
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\MainPage\\src\\main\\resources\\BrowserLib\\71.0.3578.98_chrome_installer.exe")

            driver=new ChromeDriver();
}

Public void closebrowser()
    {
        driver.close();
    }

}
