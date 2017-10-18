package BDD_JBehave;
import org.jbehave.core.annotations.*;
import BDD_JBehave.Login_Sahitest;


public class LoginSteps {

	private boolean login;
	
	@Given("El usuario no está logueado")
	public void whenElUsuarioNoEstaLogueado() {
		login = false;
	}//fin Given
	
	@When ("El usuario ingresa \"test\" como $user y \"secret\" como $pass.")
	public void LoginPlataforma(String user, String pass) {
	Login_Sahitest lgin1 = new Login_Sahitest();
	login =lgin1.userLogin(user, pass);
		
	}// fin When
	
	@Then("El $login debe ser exitoso ")
	public void verificarLogin(String loginesperado) {
		if (login == Boolean.valueOf(loginesperado)) {
			System.out.println("El login se realizo de forma correcta");
		}
		
		
	}//fin Then
	
	
}
