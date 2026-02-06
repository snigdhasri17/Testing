package stepsdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="/Maveen_BDD/src/test/resources/BDD_Sam/multiple_tags",
glue="multiple_tags",tags="@Annotation")
public class tags_TestRunner {

}
