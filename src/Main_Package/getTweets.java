package Main_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class getTweets {
    public static String[] get100Tweets () {
        //Establish connection and var' declaration:
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 	
        String baseUrl = "https://twitter.com/realdonaldtrump";
        String[] tweets = new String[100];
        int count=0;
        //Launch Chrome to page, scroll and wait in order to load older tweets:
        driver.get(baseUrl);
        for (int i=0;i<10;i++) {
        ((JavascriptExecutor)driver).executeScript("scroll(0,40000)");		
        try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
        }
        //Find tweets and copy them:
        List<WebElement> elements = driver.findElements(By.className("tweet-text"));
        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                tweets[count] = element.getText();
                count++;
                if (count == 100)
                	break;
        }
    }
        //End:
        driver.close();    
        return tweets;
    }
}