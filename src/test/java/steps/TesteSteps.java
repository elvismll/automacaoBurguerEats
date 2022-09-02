package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TestePages;
import runner.TesteRunner;

public class TesteSteps extends TesteRunner {


    WebDriver webDriver;
    TestePages testePages = new TestePages();

    @Dado("^que eu esteja no site BurguerEats$")
    public void que_eu_esteja_no_site_BurguerEats() throws Exception {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://buger-eats.vercel.app/");

        // Write code here that turns the phrase above into concrete actions
    }

    @Quando("^eu clicar no botão Cadastre-se para fazer entregas$")
    public void eu_clicar_no_botão_Cadastre_se_para_fazer_entregas() throws Exception {
        testePages.botaoCadastro();

    }

    @Quando("^preencher todos os dados do formulário$")
    public void preencher_todos_os_dados_do_formulário() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @Então("^quero que o cadastro seja realizado com sucesso$")
    public void quero_que_o_cadastro_seja_realizado_com_sucesso() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

}
