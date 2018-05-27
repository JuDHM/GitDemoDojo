package com.ch.gitdojo.introgit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(id="searchInput")
	private WebElement inputTerm;
	
	@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
	private WebElement btnSearch;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public ResultPage ejecutarBusqueda(WebDriverWait wait, String term) {
		wait.until(ExpectedConditions.visibilityOf(inputTerm));
		inputTerm.sendKeys(term);
		//wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
		btnSearch.click();
		return new ResultPage();
	}
}