package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ={"C:\\InteliJ Idea\\Workplace_InteliJ\\WWDC23\\src\\main\\Features"},
        glue={"stepDefinitions"}
)
public class runner {

}
