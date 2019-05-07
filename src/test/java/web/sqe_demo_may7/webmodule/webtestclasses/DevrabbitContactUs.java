package web.sqe_demo_may7.webmodule.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import web.sqe_demo_may7.webmodule.webpageclasses.Contactus_screen;
import web.sqe_demo_may7.webmodule.webpageclasses.HomePage_Screen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class DevrabbitContactUs extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public DevrabbitContactUs() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(DevrabbitContactUs.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("devrabbitcontactus.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Contactus_screen.projectName);
		test = reports.startTest("DevrabbitContactUs");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = Contactus_screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void Contactus_screenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Contactus_screen objContactus_screen = PageFactory.initElements(driver, Contactus_screen.class);
		testLogHeader(test, "Verify Contactus_screen page");
		objContactus_screen.fillINPUTMessage_310793(configFileObj.getProperty("Message"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Message : " + configFileObj.getProperty("Message"+ i + datasetScreencount));
		objContactus_screen.fillINPUTEmail_310803(configFileObj.getProperty("Email"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Email : " + configFileObj.getProperty("Email"+ i + datasetScreencount));
		objContactus_screen.fillINPUTName_310804(configFileObj.getProperty("Name"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Name : " + configFileObj.getProperty("Name"+ i + datasetScreencount));

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void HomePage_ScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		HomePage_Screen objHomePage_Screen = PageFactory.initElements(driver, HomePage_Screen.class);
		testLogHeader(test, "Verify HomePage_Screen page");
String text1 = objHomePage_Screen.clkAContact_310601();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("Contact"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("Contact"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("Contact"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("Contact"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= HomePage_Screen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { Contactus_screenTest(datasets);}
			if(isElementDispalyed) { HomePage_ScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}