//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class BookingTest extends AbstractTestNGCucumberTests {
    public BookingTest() {
    }
}
