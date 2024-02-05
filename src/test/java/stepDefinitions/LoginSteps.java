package stepDefinitions;

import io.cucumber.java.pt.*;
import pages.LoginPage;
import static utils.Configurations.url_base;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("que o usuario esta na tela de login")
    public void queOUsuarioEstaNaTelaDeLogin() {
        loginPage.navigateTo(url_base);

    }
    @Quando("o usuario insere credenciais validas")
    public void oUsuarioInsereCredenciaisValidas() {
        loginPage.preencherLogin("rossywan@email.com.br","adonai");

    }
    @E("clica em Entrar")
    public void clicaEmEntrar() {
        loginPage.clicarEntrar();

    }
    @Entao("o sistema redireciona para a página inicial exibindo a mensagem {string}")
    public void oSistemaRedirecionaParaAPaginaInicialExibindoAMensagem(String msgEsperada) {
        Assert.assertEquals(msgEsperada,loginPage.pegarMsgWelcome());

    }
}
