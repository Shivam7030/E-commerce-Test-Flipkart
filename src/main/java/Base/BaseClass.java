package Base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.flipkart.keyword.keyword;
import com.flipkart.utils.Environment;

public class BaseClass {

	keyword keyword = new keyword();

	@BeforeMethod
	public void setup() throws IOException {
		keyword.openBrowser(Environment.getBrowserName());
		String env = System.getProperty("env").toLowerCase(); //command line argument project>runas>runconfig.>
		keyword.launchUrl(Environment.getUrl(env));
	}

	@AfterClass
	public void tearDown() throws Exception {
		keyword.closeBrowser();
	}

}
