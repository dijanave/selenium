package Magento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.id;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author Dijana
 */

    
public class MySelenium11
 {
  private  String website= "https://magento.softwaretestingboard.com/";
   private String driverLocation = "C:\\Users\\Dijana\\Desktop\\Driveri\\chromedriver.exe";
  WebDriver driver;
  public MySelenium11 ()
  {
      
System.setProperty("webdriver.chrome.driver", this.driverLocation);  
     this.driver=new ChromeDriver();  
     
    this.driver.navigate().to(this.website);  
    this.driver.manage().window().maximize();
    }
  
  public void clickBtnByid (String Selector)
     {
        //click element
        driver.findElement(By.id(Selector)).click(); 
}
  public void clickBtnByName(String Selector)
  {
      //click element
  this.driver.findElement(By.name(Selector)).click();
  
  }
  public void clickBtnByClassName(String Selector)
  {
    //click element
      this.driver.findElement(By.className(Selector)).click();
  }
  public void clickBtnByXpath(String Selector)
  {
  // click element
      this.driver.findElement(By.xpath(Selector)).click();
  }
  public void clickBtnByLinkText(String Selector)
  {
      // click element
      this.driver.findElement(By.linkText(Selector)).click();
  }
  public void clickElementByid (String Selector)
     {
        //click element
        driver.findElement(By.id(Selector)).click(); 
}
  public void clickElementByClassName (String Selector)
     {
        //click element
        driver.findElement(By.className(Selector)).click(); 
}
  public void clickElementByLinkText (String Selector)
     {
        //click element
        driver.findElement(By.linkText(Selector)).click(); 
}
  public void clickElementByName (String Selector)
     {
        //click element
        driver.findElement(By.name(Selector)).click(); 
}
  public void clickElementByXpath (String Selector)
     {
        //click element
        driver.findElement(By.xpath(Selector)).click(); 
}
  
  
  public void inputFieldByid (String Selector , String str)
  {
  //click on the text box and inpute value
     
      this.driver.findElement(By.id(Selector)).sendKeys(str);
  
  }
   
  public void inputFieldbyName(String Selector,String str)
  {
  //click on the text box and inpute value
      this.driver.findElement(By.name(Selector)).sendKeys(str);
      
  }
  
  public void inputFieldByXhpat (String Selector , String str)
  {
    //click on the text box and inpute value
    this.driver.findElement(By.xpath(Selector)).sendKeys(str);
  }
  
  public void inputFieldByLinkText (String Selector , String str)
  {
  //click on the text box and inpute value
    this.driver.findElement(By.linkText(Selector)).sendKeys(str);
   }
  
  public void inputFieldByClassName (String Selector , String str)
  {
  //click on the text box and inpute value
    this.driver.findElement(By.className(Selector)).sendKeys(str);
    
}  

public void clearBtnByid (String Selector)
     {
        //clear text field
        driver.findElement(By.id(Selector)).clear(); 
}
  public void clearBtnByName(String Selector)
  {
      //clear text field
  this.driver.findElement(By.name(Selector)).clear();
  
  }
  public void clearBtnByClassName(String Selector)
  {
    //clear text field
      this.driver.findElement(By.className(Selector)).clear();
  }
  public void clearBtnByXpath(String Selector)
  {
  //clear text field
      this.driver.findElement(By.xpath(Selector)).clear();
  }
  public void clearBtnByLinkText(String Selector)
  {
      //clear text field
      this.driver.findElement(By.linkText(Selector)).clear();
   
  }  
  
  public void clearFieldLinkText(String Selector)
  {
      //clear text field
      this.driver.findElement(By.linkText(Selector)).clear();
   
  }  
  
  public void clearFieldId(String Selector)
  {
      //clear text field
      this.driver.findElement(By.id(Selector)).clear();
   
  }  
  
  public void clearFieldName(String Selector)
  {
      //clear text field
      this.driver.findElement(By.name(Selector)).clear();
   
  }  
  
  public void clearFieldClassName(String Selector)
  {
      //clear text field
      this.driver.findElement(By.className(Selector)).clear();
   
  }  
  
  public void clearFieldXpath(String Selector)
  {
      //clear text field
      this.driver.findElement(By.xpath(Selector)).clear();
   
  }  
  
   public void clearElementXpath(String Selector)
  {
      //clear text field
      this.driver.findElement(By.xpath(Selector)).clear();
   
  }  
  
    public void clearElementId(String Selector)
  {
      //clear text field
      this.driver.findElement(By.id(Selector)).clear();
   
  }  
  
     public void clearElementName(String Selector)
  {
      //clear text field
      this.driver.findElement(By.name(Selector)).clear();
   
  }  
  
      public void clearElementClassName(String Selector)
  {
      //clear text field
      this.driver.findElement(By.className(Selector)).clear();
   
  }  
      
       public void clearElementLinkText(String Selector)
  {
      //clear text field
      this.driver.findElement(By.linkText(Selector)).clear();
   
  }  
       
   public void close()  
   {
   this.driver.close();
   
   }
   
   public void refresh()
   {
   this.driver.navigate().refresh();
   }
   
   public void back()
   {
   this.driver.navigate().back();
   
   }
   public void forward()
   {
   this.driver.navigate().forward();
   }
   public void scrollPageDown ()
   {
       JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0, 4500);");    
   }
   public void scrollPageUp ()
   {
           JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0, -4500);");
   
   }
   
   
   
   public  void scrollWeb(int xOffset, int yOffset) {
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("scrollBy(arguments[0], arguments[1])", xOffset, yOffset);
    }  
    
   public void dropDownIndexById (String selector, int index)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.id(selector)));  
          dropdown.selectByIndex(index);   
   
   }
   
   public void dropDownIndexByName (String selector, int index)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.name(selector)));  
          dropdown.selectByIndex(index);   
}
   
 public void dropDownIndexByLinkText (String selector, int index)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.linkText(selector)));  
          dropdown.selectByIndex(index);  
   }
   
   public void dropDownIndexByClassName (String selector, int index)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.className(selector)));  
          dropdown.selectByIndex(index);   
}
   
   public void dropDownIndexByXpath (String selector, int index)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.xpath(selector)));  
          dropdown.selectByIndex(index);   
   }
   
   public void dropDownValueByName (String selector, String value)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.name(selector)));  
          dropdown.selectByValue(value);   
}
   public void dropDownValueById (String selector, String value)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.id(selector)));  
          dropdown.selectByValue(value);  
          
   }
   public void dropDownValueByLinkText (String selector, String value)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.linkText(selector)));  
          dropdown.selectByValue(value);  
   }
   
   public void dropDownValueByClassName (String selector, String value)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.className(selector)));  
          dropdown.selectByValue(value);  
   }
   
   public void dropDownValueByXpath (String selector, String value)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.xpath(selector)));  
          dropdown.selectByValue(value);  
   }
   
   public void dropDownVisibleTextById (String selector, String text)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.id(selector)));  
          dropdown.selectByVisibleText(text);  
   }
     
   
    public void dropDownVisibleTextByName (String selector, String text)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.name(selector)));  
          dropdown.selectByVisibleText(text);  
   }
 public void dropDownVisibleTextByLinkText (String selector, String text)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.linkText(selector)));  
          dropdown.selectByVisibleText(text);  
   }
    public void dropDownVisibleTextByClassName (String selector, String text)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.className(selector)));  
          dropdown.selectByVisibleText(text);  
   }
  public void dropDownVisibleTextByXpath (String selector, String text)
   {
   
   Select dropdown = new Select(this.driver.findElement(By.xpath(selector)));  
          dropdown.selectByVisibleText(text);  
   }
    
    public void ScrollToElementByName (String selector) {
 
      WebElement element = driver.findElement(By.name(selector));
        
        // Create instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", element);
 
 }
    public void clickRadioBtnByName (String selector)
   {
    // Click on the button
    this.driver.findElement(By.name(selector)).click();  
   }
    
    public void clickRadioBtnById (String selector)
   {
    // Click on the button
    this.driver.findElement(By.id(selector)).click();  
   }
    
    public void clickRadioBtnByLinkText (String selector)
   {
    // Click on the button
    this.driver.findElement(By.linkText(selector)).click();  
   }
    
    public void clickRadioBtnByXpath (String selector)
   {
    // Click on the button
    this.driver.findElement(By.xpath(selector)).click();  
   }
    
    public void clickRadioBtnByClassName (String selector)
   {
    // Click on the button
    this.driver.findElement(By.className(selector)).click();  
   }
    public void AletboxAccept () 
{
Alert alert = (Alert) driver.switchTo().alert();  
alert.accept();

}

public void AletboxDismiss () 
{
Alert alert = (Alert) driver.switchTo().alert();  
alert.dismiss();
}

 public void clickElementJsXpath ( String xpath)
    {JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement radioButton = driver.findElement(By.xpath(xpath)); 
      js.executeScript("arguments[0].click();", radioButton);

}
 public void SelectCheckBoxByName (String selector)
   {
    // Click on the check box
    this.driver.findElement(By.name(selector)).click();  
   }
 
  public void SelectCheckBoxById (String selector)
   {
    // Click on the check box
    this.driver.findElement(By.id(selector)).click();  
   }
  
   public void SelectCheckBoxByLinkText (String selector)
   {
    // Click on the check box
    this.driver.findElement(By.linkText(selector)).click();  
   }
 
  public void SelectCheckBoxByXpath (String selector)
   {
    // Click on the check box
    this.driver.findElement(By.xpath(selector)).click();  
   }
 
   public void SelectCheckBoxByClassName (String selector)
   {
    // Click on the check box
    this.driver.findElement(By.className(selector)).click();  
   }
 
 
 public void moveSliderToValueByXpath(String sliderId, int targetValue) {
        WebElement slider = driver.findElement(By.xpath(sliderId));
        Actions move = new Actions(driver);

        int sliderWidth = slider.getSize().width;
        int minValue = Integer.parseInt(slider.getAttribute("min"));
        int maxValue = Integer.parseInt(slider.getAttribute("max"));

        // Ensure the targetValue is within the slider's min and max range
        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range");
        }

 // Calculate the offset percentage
        double percentage = (double) (targetValue - minValue) / (maxValue - minValue);
        int xOffset = (int) (sliderWidth * percentage);

        // Move the slider
        move.clickAndHold(slider)
            .moveByOffset(xOffset - (sliderWidth / 2), 0) // Adjust the offset to the center of the slider
            .release()
            .perform();
}
 
 public void moveSliderToValueById(String sliderId, int targetValue) {
        WebElement slider = driver.findElement(By.id(sliderId));
        Actions move = new Actions(driver);

        int sliderWidth = slider.getSize().width;
        int minValue = Integer.parseInt(slider.getAttribute("min"));
        int maxValue = Integer.parseInt(slider.getAttribute("max"));

        // Ensure the targetValue is within the slider's min and max range
        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range");
        }

 // Calculate the offset percentage
        double percentage = (double) (targetValue - minValue) / (maxValue - minValue);
        int xOffset = (int) (sliderWidth * percentage);

        // Move the slider
        move.clickAndHold(slider)
            .moveByOffset(xOffset - (sliderWidth / 2), 0) // Adjust the offset to the center of the slider
            .release()
            .perform();
}
 public void moveSliderToValueByLinkText(String sliderId, int targetValue) {
        WebElement slider = driver.findElement(By.linkText(sliderId));
        Actions move = new Actions(driver);

        int sliderWidth = slider.getSize().width;
        int minValue = Integer.parseInt(slider.getAttribute("min"));
        int maxValue = Integer.parseInt(slider.getAttribute("max"));

        // Ensure the targetValue is within the slider's min and max range
        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range");
        }

 // Calculate the offset percentage
        double percentage = (double) (targetValue - minValue) / (maxValue - minValue);
        int xOffset = (int) (sliderWidth * percentage);

        // Move the slider
        move.clickAndHold(slider)
            .moveByOffset(xOffset - (sliderWidth / 2), 0) // Adjust the offset to the center of the slider
            .release()
            .perform();
}

 public void moveSliderToValueByName(String sliderId, int targetValue) {
        WebElement slider = driver.findElement(By.name(sliderId));
        Actions move = new Actions(driver);

        int sliderWidth = slider.getSize().width;
        int minValue = Integer.parseInt(slider.getAttribute("min"));
        int maxValue = Integer.parseInt(slider.getAttribute("max"));

        // Ensure the targetValue is within the slider's min and max range
        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range");
        }

 // Calculate the offset percentage
        double percentage = (double) (targetValue - minValue) / (maxValue - minValue);
        int xOffset = (int) (sliderWidth * percentage);

        // Move the slider
        move.clickAndHold(slider)
            .moveByOffset(xOffset - (sliderWidth / 2), 0) // Adjust the offset to the center of the slider
            .release()
            .perform();
}
 
  public void moveSliderToValueByClassName(String sliderId, int targetValue) {
        WebElement slider = driver.findElement(By.className(sliderId));
        Actions move = new Actions(driver);

        int sliderWidth = slider.getSize().width;
        int minValue = Integer.parseInt(slider.getAttribute("min"));
        int maxValue = Integer.parseInt(slider.getAttribute("max"));

        // Ensure the targetValue is within the slider's min and max range
        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range");
        }

 // Calculate the offset percentage
        double percentage = (double) (targetValue - minValue) / (maxValue - minValue);
        int xOffset = (int) (sliderWidth * percentage);

        // Move the slider
        move.clickAndHold(slider)
            .moveByOffset(xOffset - (sliderWidth / 2), 0) // Adjust the offset to the center of the slider
            .release()
            .perform();
}
  public String GetTextById (String selector){
  //this this metod is geting text from metod
  return this.driver.findElement(By.id(selector)).getText();
  
  }
  
  public String GetTextByName (String selector){
  //this this metod is geting text from metod
  return this.driver.findElement(By.name(selector)).getText();
  
  }
  public String GetTextByXpath (String selector){
  //this this metod is geting text from metod
  return this.driver.findElement(By.xpath(selector)).getText();
  
  }
  public String GetTextByLinkText (String selector){
  //this this metod is geting text from metod
  return this.driver.findElement(By.linkText(selector)).getText();
  
  }
  public String GetTextByClassName (String selector){
  //this this metod is geting text from metod
  return this.driver.findElement(By.className(selector)).getText();
  
  }

  public void setDateValue (String selector,String value){
  JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("document.querySelector('" + selector + "').value = '" + value + "';");
}
  
  public void moveRangeSlider(By sliderLocator, int minValue, int maxValue) {
        WebElement slider = driver.findElement(sliderLocator);
        WebElement leftHandle = slider.findElements(By.className("ui-slider-handle")).get(0);
        WebElement rightHandle = slider.findElements(By.className("ui-slider-handle")).get(1);

        int sliderWidth = slider.getSize().width;
        int minRange = Integer.parseInt(slider.getAttribute("data-min"));
        int maxRange = Integer.parseInt(slider.getAttribute("data-max"));

        // Calculate the percentages for the desired values
        double minPercent = ((double)(minValue - minRange) / (maxRange - minRange)) * 100;
        double maxPercent = ((double)(maxValue - minRange) / (maxRange - minRange)) * 100;

        // Calculate the exact pixel offset from the current position
        double currentMinLeft = Double.parseDouble(leftHandle.getCssValue("left").replace("px", ""));
        double currentMaxLeft = Double.parseDouble(rightHandle.getCssValue("left").replace("px", ""));
        double desiredMinLeft = (minPercent * sliderWidth) / 100;
        double desiredMaxLeft = (maxPercent * sliderWidth) / 100;

        double offsetXMin = desiredMinLeft - currentMinLeft;
        double offsetXMax = desiredMaxLeft - currentMaxLeft;

        Actions action = new Actions(driver);

        // Move the left (min) handle
        action.dragAndDropBy(leftHandle, (int)offsetXMin, 0).perform();

        // Move the right (max) handle
        action.dragAndDropBy(rightHandle, (int)offsetXMax, 0).perform();
    }
public void moveRangeSliderWithJS(By sliderLocator, int minValue, int maxValue) {
        WebElement slider = driver.findElement(sliderLocator);
        WebElement leftHandle = slider.findElements(By.className("ui-slider-handle")).get(0);
        WebElement rightHandle = slider.findElements(By.className("ui-slider-handle")).get(1);

        int minRange = Integer.parseInt(slider.getAttribute("data-min"));
        int maxRange = Integer.parseInt(slider.getAttribute("data-max"));

        // Calculate the percentages for the desired values
        double minPercent = ((double)(minValue - minRange) / (maxRange - minRange)) * 100;
        double maxPercent = ((double)(maxValue - minRange) / (maxRange - minRange)) * 100;

        // Use JavaScript to set the slider handle positions and trigger the 'input' and 'change' events
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].style.left = '" + minPercent + "%';" +
            "arguments[0].parentNode.dispatchEvent(new Event('input', { bubbles: true }));" +
            "arguments[0].parentNode.dispatchEvent(new Event('change', { bubbles: true }));",
            leftHandle
        );
        js.executeScript(
            "arguments[0].style.left = '" + maxPercent + "%';" +
            "arguments[0].parentNode.dispatchEvent(new Event('input', { bubbles: true }));" +
            "arguments[0].parentNode.dispatchEvent(new Event('change', { bubbles: true }));",
            rightHandle
        );
    }
public void uploadFileById(String elementId, String filePath) {
        WebElement uploadElement = driver.findElement(By.id(elementId));
        uploadElement.sendKeys(filePath);
    }
}

