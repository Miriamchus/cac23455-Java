package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		//crear un objeto orador que luego se envia la DB
		Orador nuevoOrador = new Orador("carlos", "Lopez", "email@email.com", "JAVA", LocalDate.now());
		System.out.println(nuevoOrador);

	}

}
