package Utilities;

import org.openqa.selenium.By;

public class SortingConfiguration extends Methods {
	public By Sortingoption_c = By.xpath("//android.view.ViewGroup[@content-desc=\"sort button\"]");
	public By SortByNameDescendingOrder_c = By.xpath("//android.view.ViewGroup[@content-desc=\"nameDesc\"]");
	public By SortByPriceAscendingOrder_c = By.xpath("//android.view.ViewGroup[@content-desc=\"priceAsc\"]");
	
	
	public void Sorting() throws InterruptedException{
		Thread.sleep(2000);
		clickElement(Sortingoption_c);
		Thread.sleep(2000);
		clickElement(SortByNameDescendingOrder_c);
		Thread.sleep(2000);
		clickElement(Sortingoption_c);
		Thread.sleep(2000);
		clickElement(SortByPriceAscendingOrder_c);
		Thread.sleep(2000);



		
	}

}
