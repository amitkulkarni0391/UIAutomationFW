package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage {
	
	int i = 10;
	
	By locator = By.id("cart");
	
	public void addCart() {
		System.out.println("Add cart");
	}

}
