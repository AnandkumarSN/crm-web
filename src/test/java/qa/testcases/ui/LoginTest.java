package qa.testcases.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		System.setProperty("Webdriver.Chrome.Driver", "src\\main\\resources\\webDriverBinaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.id("email")).sendKeys("abcdefg@xyz.com");
		// driver.findElement(By.id("pass")).sendKeys("12345");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// String actual
		// =driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Facebook – Log in or Sign up";
		if (actual.equals(expected)) {
			System.out.println("Title is as expected");
		} else {
			System.out.println(
					String.format("Title is not matching -- expected is : %s but actual is : %s", expected, actual));
		}
	}

}
