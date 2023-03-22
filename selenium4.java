package besant;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4 {
//Write code for taking Screenshot
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABI\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		WebElement sc = driver.findElement(By.id("home"));
		File source1 = sc.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\ABI\\Documents\\1.png");
		FileUtils.copyFile(source1, des1);
		driver.quit();
	}

}
