package com.aconex.game.of.life;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameOfLifePattern extends BasePage {
	public static final String MATRIX_SIZE="gol.matrix.size";
	public static final String ROW_BLOCK="gol.row.value";
	public static final String SELECT_ROW_1="gol.row.1";
	public static final String GO_BUTTON="go.button";
	private final  Logger logger=LoggerFactory.getLogger(getClass());
	public GameOfLifePattern(WebDriver driver) {
		super(driver);
	}
	Environment env=new Environment();
		
	 public void varyMatrixSize(int xOffset,int yOffset){
		 WebElement matrixRanger=driver.findElement(By.id(env.getLocatorValue(MATRIX_SIZE)));
		 Actions action=new Actions(driver);
		 action.dragAndDropBy(matrixRanger,xOffset,yOffset).build().perform();
	 }
	 
	 public void patternGenerator() throws Exception{
		 WebElement rowGrid=driver.findElement(By.cssSelector(env.getLocatorValue(ROW_BLOCK)));
		 try{
			 if(rowGrid.isDisplayed()){
				 WebDriverWait wait=new WebDriverWait(driver,30);
				 wait.until(ExpectedConditions.elementToBeClickable(rowGrid));
				 for(int n=2;n<=11;n++){
					 WebElement first_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div[2]/div[" + n +"]"));
					 first_cell.click();}
				 for (int n=3;n<=11;n++){
					 WebElement second_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div["+ n + "]/div[2]"));
					 second_cell.click();
				 }
				 for (int n=3;n<=11;n++){
					 WebElement third_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div[11]/div[" + n +"]"));
					 third_cell.click();
				 }
				 for (int n=3;n<=10;n++){
					 WebElement fourth_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div["+ n + "]/div[11]"));
					 fourth_cell.click();
				 
				 }
				 for(int n=3;n<=10;n++){
					 WebElement fifth_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div[3]/div[" + n +"]"));
					 fifth_cell.click();
				}
				 
				 for (int n=3;n<=10;n++){
					 WebElement sixth_cell=driver.findElement(By.xpath("//*[@id='gol']/div/div[10]/div[" + n +"]"));
					 sixth_cell.click();
					
				 }
				 driver.findElement(By.id(env.getLocatorValue(GO_BUTTON))).click();
				 Thread.sleep(5000);
			 }
			 
		 }
		 catch(WebDriverException e){
			 logger.error("Element not foundException");
		 }
		 
	
		 
	 }
	 
	
	
	

}
