package com.example.slot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//Esta anotación indica que esta será una prueba que correra con este motor de ejecución.
//SpringRunner permite inyectar código dentro de nuestras pruebas
@RunWith(SpringRunner.class) 
@SpringBootTest
public class PruebaDeServicioDeCarlculadora {
	
	
	@Autowired
	ServicioDeCalculadora servicioDeCalculadora;
	
	@Test
	public void pruebaDeSumaDeDosNumeros() {
		
		//Dado que - Entradas
		int a = 3;
		int b = 4;
		
		//Cuando
		int result = servicioDeCalculadora.sumar(a, b);
		
		//Entonces... Verificamos
		assertEquals(7, result); //Método que verifica si un resultado sea igual al resultado de la operación
	}

}
