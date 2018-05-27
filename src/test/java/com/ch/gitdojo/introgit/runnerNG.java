package com.ch.gitdojo.introgit;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class runnerNG {
	
	private WebDriver driver;
	
	@BeforeClass
	public void inicializar() throws MalformedURLException {
	 	
	}
	
	@Test
	public void ejecutar()  throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 	ChromeOptions options = new ChromeOptions();
	 	//options.addArguments("--use-fake-ui-for-media-stream");
        //options.addArguments("--use-fake-device-for-media-stream");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "66");
	 	capabilities.setCapability(ChromeOptions.CAPABILITY, options);	
        
        driver  = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
}
