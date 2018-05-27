package com.ch.gitdojo.introgit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ch.gitdojo.introgit.pages.HomePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Runner {
	/*
	 * Definicion de constantes
	 */
	public static final String URL = "https://www.wikipedia.org/";
	public static final String termSearched = "Automatizar";
	
	private WebDriver driver;
	private HomePage homePage;
	private WebDriverWait wait;
	
	@BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        homePage = new HomePage(driver);
        driver.get(URL);
    }
    
    @Test
    public void test() {
    		homePage.ejecutarBusqueda(wait, termSearched);
    		/*
        // Your test code here. For example:
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        By searchInput = By.id("searchInput");
        
        wait.until(ExpectedConditions.presenceOfElementLocated(searchInput));
        driver.findElement(searchInput).sendKeys("Software");
        By searchButton = By.id("searchButton");
       wait.until(elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();

       wait.until(textToBePresentInElementLocated(By.tagName("body"),"Computer software")); */
    }
}
