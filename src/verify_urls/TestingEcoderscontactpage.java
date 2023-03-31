package verify_urls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcoderscontactpage {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G Karthik\\eclipse-workspace\\Testing_ecoders\\all_jar_files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5000/contact");
        Thread.sleep(5000);
        String s=driver.getTitle();
        System.out.println(s);
        String s1=driver.getCurrentUrl();
        System.out.println(s1);
        String s2=driver.getPageSource();
        System.out.println(s2);
        String expectedurl="http://127.0.0.1:5000/contact";
        if(expectedurl.equals(s1)) {
        	System.out.println("Testcase pass and url matched");
        }
        else {
        	System.out.println("Testcase failed and url didnot match");
        }
        driver.quit();
	}

}
