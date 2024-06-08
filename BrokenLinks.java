package NewPac;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DChoudhary5\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//		HttpsURLConnection conn = (HttpsURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCode = conn.getResponseCode();
//		System.out.println(responseCode);
		
		List <WebElement> urls = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a1 = new SoftAssert();
		for (int i=0;i<urls.size();i++) {
			String url=urls.get(i).getAttribute("href");
			//System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			//Below is the hard assertion which will cause the code to fail and rest links wont be identified
			//Assert.assertTrue(responseCode<400,"The link with text "+ urls.get(i).getText()+" is broken with code "+ responseCode );
			
			//We can usesoft assertions 
			a1.assertTrue(responseCode<400,"The link with text "+ urls.get(i).getText()+" is broken with code "+ responseCode );

			
			
			
//			if(responseCode>400) {
//				System.out.println("The link with text "+ urls.get(i).getText()+" is broken with code "+ responseCode);
//				//Assert.assertFalse(true); - this is hard assertion
//				
//			}
			//System.out.println(responseCode);
		}
		a1.assertAll();
	}

}
