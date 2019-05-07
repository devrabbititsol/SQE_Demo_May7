package web.sqe_demo_may7.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomePage_Screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SQE_Demo_May7\",\"project_description\":\"desc\",\"project_id\":276,\"module_name\":\"WEBModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":422,\"testcase_name\":\"DevrabbitContactUs\",\"testcase_id\":457,\"testset_id\":0,\"executed_timestamp\":-1850246860,\"browser_type\":\"chrome\"}";

	public static String projectName = "sqe_demo_may7";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomePage_Screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_310601A;
	public String clkAContact_310601() {
		waitForExpectedElement(driver, Contact_310601A);		
		String text = Contact_310601A.getText();
		Contact_310601A.click();
		return text;
	}

}