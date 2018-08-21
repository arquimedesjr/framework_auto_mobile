package br.com.automationMobile.runnerTest;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json", retryCount = 3, detailedReport = true, detailedAggregatedReport = true, overviewReport = true,
		// coverageReport = true,
		jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF = true, excludeCoverageTags = {
				"@flaky" }, includeCoverageTags = { "@passed" }, outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml" }, features = "src\\test\\resources\\features\\run\\", glue = "br.com.automationMobile.stepDefinition", dryRun = false

)
public class RunnerTest {

}
