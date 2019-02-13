package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\moses\\IdeaProjects\\CucumberProject\\GenericAPI\\src\\main\\java\\Feature", //the path of the feature files
        glue={"PagefactoryStepDef"}, //the path of the step definition files
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true, //display the console output in a proper readable format
        strict = false, //it will check if any step is not defined in step definition file
        dryRun = false, //to check the mapping is proper between feature file and step def file
        tags = {"@SmokeTest_3"}
)
public class CucumerRunner {
}
