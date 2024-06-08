package NewPac;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Chromeoptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DChoudhary5\\eclipse\\chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		//options.addExtensions(null)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\DChoudhary5\\Desktop\\SSEclipse.png"));
	}

}


/*
import java.util.HashMap;

import java.util.Map;



import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;



public class SSLCheck {



public static void main(String[] args) {

// TODO Auto-generated method stub

ChromeOptions options = new ChromeOptions();

Proxy proxy = new Proxy();

proxy.setHttpProxy("ipaddress:4444");

options.setCapability("proxy", proxy);

Map<String, Object> prefs = new HashMap<String, Object>();



prefs.put("download.default_directory", "/directory/path");



options.setExperimentalOption("prefs", prefs);

// FirefoxOptions options1 = new FirefoxOptions();

// options1.setAcceptInsecureCerts(true);

// EdgeOptions options2 = new EdgeOptions();

options.setAcceptInsecureCerts(true);

System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");



WebDriver driver = new ChromeDriver(options);

driver.get("https://expired.badssl.com/");

System.out.println(driver.getTitle());



}



}
*/