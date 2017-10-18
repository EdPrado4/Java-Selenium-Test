package PruebasJunit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import PruebasJunit.Operaciones;

public class OperacionesTest {
// se instancia un objeto de tipo operaciones para realizar la prueba
	
	Operaciones optest;
	
	//Se inicializa el objeto antes de las pruebas, utilizando el constructor por defecto
	@Before
	public void init(){
		optest = new Operaciones();	
	}//fin init
	
	//método para probar el método suma.
	@Test
	public void PruebaSuma() {
		
		int x = 5, y = 3;
			//Al probar el método suma con x = 5, y = 3 el resultado esperado es 8
		int esperado = 8;
		int resultado = optest.suma(x, y);
			//Se realiza la prueba utilizando el comando assert de Junit
		assertEquals(" El programa tiene un fallo en el método suma",esperado, resultado );
		
	}// fin PruebaSuma
	
	
}//fin OperacionesTest
