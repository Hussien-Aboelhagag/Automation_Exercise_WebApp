package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    WebElement searchTxtBox= driver.findElement(By.id("search_product"));
    WebElement searchBtn=driver.findElement(By.id("submit_search"));
    public void searchWithProduct(String searchValue){
        setTxtElementText(searchTxtBox,searchValue);
        clickBtn(searchBtn);
    }
}
