package BDD_JBehave;

public class Login_Sahitest {

	public boolean userLogin(String user, String pass ) {
		
		boolean loginexitoso = false;
		String uservalido = "test";
		String passvalido = "secret";
		
		if((user == uservalido)&&(pass==passvalido)) {
			System.out.println("Login Exitoso!");
			System.out.println("Bienvenido "+user);
			loginexitoso = true;
			return loginexitoso;
		}//fin if
		
		else {
			System.out.println("Error! credenciales de acceso no válidas");
			return loginexitoso;
		}//fin else
		
	}//fin userLogin
		
}
