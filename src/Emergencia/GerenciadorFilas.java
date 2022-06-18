package Emergencia;

import java.util.ArrayList;

public class GerenciadorFilas {
	
	public void vacina1(ArrayList<Paciente> naoVacinados, ArrayList<Paciente> vacinados) {
		vacinados.add(naoVacinados.get(0));
		vacinados.get(vacinados.size()- 1).setVacinado("Sim");
		naoVacinados.remove(0);
	}
	
	public void imprimeFila(ArrayList<Paciente> fila) {
		System.out.println("Vacinado:  Idade:    Nome:"); 	
		for(int i=0; i<fila.size(); i++) {
			System.out.println(fila.get(i).toString());
		}
		System.out.println();
	}
	
	
	
}
