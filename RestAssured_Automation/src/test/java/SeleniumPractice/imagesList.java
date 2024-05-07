package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class imagesList extends BaseClass {
	
	@Test
	public void totalImages() throws InterruptedException
	{
		
		Integer counter = 0; 
		Thread.sleep(2000);
		
		List<WebElement> listImages =  driver.findElements(By.tagName("img")); 
		System.out.println("No.of images: " + listImages.size());
		//WebElement image = null;
		
		
		//get all the displayed images
		
		  for(WebElement image:listImages)
		  { 
			  if(image.isDisplayed())
			  { counter++;
		  System.out.println(counter + " "+ image.getAttribute("alt"));
		  
		  } }
		 
		
		
		for(int i = 0; i<listImages.size(); i++)
		{
			if(i == 15)
				System.out.println("15 image: " + listImages.get(i).getAttribute("alt"));
		}
		
		//System.out.println("No of total displayable images: " + counter);
		
		driver.close();
		
	}

}
