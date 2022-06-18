package TestesEmergencia;
import java.util.ArrayList;
import java.util.Collections;

import Emergencia.GerenciadorFilas;
import Emergencia.Paciente;

public class GerenciadorFilasTeste {
	public static void main(String[] args) {
		GerenciadorFilas gf = new GerenciadorFilas();
		
		ArrayList<Paciente> naoVacinados = new ArrayList<>();
		ArrayList<Paciente> vacinados = new ArrayList<>();
		Paciente paciente1 = new Paciente("Guilherme", 20);
		Paciente paciente2 = new Paciente("Julio", 10);
		Paciente paciente3 = new Paciente("Armando", 50);
		Paciente paciente4 = new Paciente("Jéssica", 30);
		Paciente paciente5 = new Paciente("Aida", 25);
		Paciente paciente6 = new Paciente("Kléber", 29);
		Paciente paciente7 = new Paciente("Jorge", 16);
		Paciente paciente8 = new Paciente("Amanda", 77);
		Paciente paciente9 = new Paciente("Nathalia", 98);
		Paciente paciente10 = new Paciente("Júlia", 26);
		
		naoVacinados.add(paciente1);
		naoVacinados.add(paciente2);
		naoVacinados.add(paciente3);
		naoVacinados.add(paciente4);
		naoVacinados.add(paciente5);
		naoVacinados.add(paciente6);
		naoVacinados.add(paciente7);
		naoVacinados.add(paciente8);
		naoVacinados.add(paciente9);
		naoVacinados.add(paciente10);
		
		Collections.sort(naoVacinados);
		gf.vacina1(naoVacinados, vacinados);
		gf.vacina1(naoVacinados, vacinados);
		gf.vacina1(naoVacinados, vacinados);
		gf.vacina1(naoVacinados, vacinados);
		gf.vacina1(naoVacinados, vacinados);
		gf.imprimeFila(vacinados);
		gf.imprimeFila(naoVacinados);
	}
}
