package web.sqe_demo_may7.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Contactus_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SQE_Demo_May7\",\"project_description\":\"desc\",\"project_id\":276,\"module_name\":\"WEBModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":422,\"testcase_name\":\"DevrabbitContactUs\",\"testcase_id\":457,\"testset_id\":0,\"executed_timestamp\":-1850246860,\"browser_type\":\"chrome\"}";

	public static String projectName = "sqe_demo_may7";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Contactus_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_26_type']")	
	private WebElement	Message_310793INPUT;
	public void fillINPUTMessage_310793(String varInputValue) {
		waitForExpectedElement(driver, Message_310793INPUT);
		Message_310793INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_20']")	
	private WebElement	Email_310803INPUT;
	public void fillINPUTEmail_310803(String varInputValue) {
		waitForExpectedElement(driver, Email_310803INPUT);
		Email_310803INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_19']")	
	private WebElement	Name_310804INPUT;
	public void fillINPUTName_310804(String varInputValue) {
		waitForExpectedElement(driver, Name_310804INPUT);
		Name_310804INPUT.sendKeys(varInputValue);
	}

}