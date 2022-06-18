package Emergencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controlador {
	GerenciadorFilas cf = new GerenciadorFilas();
	Scanner leitor = new Scanner(System.in);
	
	
	public void principal() {
		GerenciadorFilas cf = new GerenciadorFilas();
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
		System.out.print("Fila de vacinação para COVID 19. ");
		while(true) {
			System.out.println("Escolha a sua ação (1-4): \n"
							  +"1- Ver a fila de pessoas esperando pela vacina. \n"
							  +"2- Ver fila de pessoas vacinadas. \n"
							  +"3- Vacinas chegaram! Vacinar o próximo na fila. \n"
							  +"4- Sair.");
			String resposta = leitor.next();
			if(resposta.equalsIgnoreCase("1")) {
				cf.imprimeFila(naoVacinados);
			}else if(resposta.equalsIgnoreCase("2")) {
				cf.imprimeFila(vacinados);
			}else if(resposta.equalsIgnoreCase("3")) {
				cf.vacina1(naoVacinados, vacinados);
			}else if(resposta.equalsIgnoreCase("4")) {
				break;
			}else {
				System.out.print("Opção incorreta. ");
			}
	}
	
}}
