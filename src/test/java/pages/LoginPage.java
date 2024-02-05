package pages;

import org.openqa.selenium.By;

public class LoginPage extends DefaultPage{


    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btn_entrar = By.cssSelector("button[type=\"submit\"]");
    private By msgWelcome = By.cssSelector("div[role=\"alert\"]");


    public void preencherLogin(String email, String senha){
        inputText(inputEmail,email);
        inputText(inputSenha, senha);
    }

    public void clicarEntrar(){
        click(btn_entrar);
    }
    public String pegarMsgWelcome(){
        waitToElement(msgWelcome);
        return getElement(msgWelcome).getText();
    }
}
