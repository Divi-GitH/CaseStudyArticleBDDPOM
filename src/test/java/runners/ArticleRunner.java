package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features ="src//test//resources//features//ConduitCRUD.feature",
        glue = {"StepDef"},
		monochrome = true,
		dryRun = false,
		plugin={"pretty",			
			    "html:target//Reports//HtmlReport.html",
			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	}
		
)
public class ArticleRunner extends AbstractTestNGCucumberTests{


}