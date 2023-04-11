package Base;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.flipkart.keyword.Keyword;
import com.flipkart.utils.Environment;

public class BaseClass {


	@BeforeMethod
	public void setup() throws IOException {
		Keyword.openBrowser(Environment.getBrowserName());
		String env = System.getProperty("env").toLowerCase(); //command line argument project>runas>runconfig.>
		Keyword.launchUrl(Environment.getUrl(env));
	}

	@AfterClass
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}

}
