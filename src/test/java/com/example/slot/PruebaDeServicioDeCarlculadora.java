package com.example.slot;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;;
import static org.mockito.Mockito.*;


//Esta anotación indica que esta será una prueba que correra con este motor de ejecución.
//SpringRunner permite inyectar código dentro de nuestras pruebas

public class PruebaDeServicioDeCarlculadora {

	ServicioDeCalculadora servicioDeCalculadora = mock(ServicioDeCalculadora.class);
	
	@Test
	public void pruebaDeSumaDeDosNumeros() {

		//Given
		int a = 3;
		int b = 4;

		//When
		ServicioDeCalculadora servicioDeCalculadora2 = new ServicioDeCalculadora();
		int result = servicioDeCalculadora2.sumar(a, b);
		
		//Then
		assertEquals(7, result); //Método que verifica si un resultado sea igual al resultado de la operación
	}

	@Test
	public void SumaMock() {
		when(servicioDeCalculadora.sumar(3,4)).thenReturn(7); //Given - When
		assertEquals(7, servicioDeCalculadora.sumar(3,4)); //Then
	}

}
