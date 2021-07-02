package com.example.slot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class PruebaUnitariaApplication implements CommandLineRunner{


	ServicioDeCalculadora servicioDeCalculadora = new ServicioDeCalculadora();
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnitariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		final int a = 3;
		final int b = 4;
		
		System.out.println(String.format("Resultado: %d", servicioDeCalculadora.sumar(a, b)));
	}

}
