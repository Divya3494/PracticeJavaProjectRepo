
package practicePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Divya\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.wait(20);
		driver.manage().window().maximize();
		 String url= "https://www.youtube.com/";
		 driver.get(url);
		System.out.println("hi");
}									

}
