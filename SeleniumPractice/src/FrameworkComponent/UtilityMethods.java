package FrameworkComponent;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {

	public static void selectOptions(WebElement dropdown, String otpion) {
		Select select = new Select(dropdown);
		int counter = 0;
		try {
			select.selectByIndex(Integer.parseInt(otpion));
			counter++;
		} catch (Exception e) {
			System.out.println("not an index");
		}
		if (counter == 0) {
			try {
				select.selectByValue(otpion);
			} catch (Exception e) {

				select.selectByVisibleText(otpion);
			}

		}

	}

	public static void takeScreenshot(WebDriver driver, /*File dest*//* Method method*/String method) throws IOException {
LocalDateTime time=LocalDateTime.now();
		TakesScreenshot ts = (TakesScreenshot) driver;
	//	File destination = dest;
		String fileNameString=time.toString().replaceAll(":", "-")+method;
		File file=new File("./Screenshots/"+fileNameString+".png");
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(file1, file);

	}

}
