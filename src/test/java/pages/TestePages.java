package pages;


import org.openqa.selenium.By;
import runner.TesteRunner;

public class TestePages extends TesteRunner {

    private By botaoCadastreSe = By.xpath("//a[contains(.,'Cadastre-se para fazer entregas')]");

    public void botaoCadastro(){
        getDriver().findElement(botaoCadastreSe).click();
    }

}
