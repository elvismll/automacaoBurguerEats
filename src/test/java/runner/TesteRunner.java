package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) // anotação rodar com
@CucumberOptions( // Informações do Cucumber
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"@cadastro"})

public class TesteRunner extends RunBase{
}
