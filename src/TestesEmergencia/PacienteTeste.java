package TestesEmergencia;

import Emergencia.Paciente;

public class PacienteTeste {
	public static void main(String[] args) {
		Paciente p = new Paciente("Guilherme", 20);
		
		System.out.println("Vacinado:  Idade:    Nome:");
		System.out.println(p.toString());
		
		p.setIdade(23);
		p.setNome("Bárbara");
		
		System.out.println("Vacinado:  Idade:    Nome:");
		System.out.println(p.toString());
	
	
	
	}
}
