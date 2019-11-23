import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/java/features/")
public class RunCucumberTest {

}
