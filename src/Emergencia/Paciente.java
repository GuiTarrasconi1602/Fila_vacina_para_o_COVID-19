package Emergencia;

public class Paciente implements Comparable<Paciente>{
	private String nome;
	private int idade;
	private String vacinado = "Não"; 
	
	
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	

	public String getVacinado() {
		return vacinado;
	}
	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}



	@Override
	public int compareTo(Paciente outroPaciente) {
		if (this.idade > outroPaciente.getIdade()) { 
			  return -1; 
			  } if (this.idade < outroPaciente.getIdade()) { 
			  return 1; 
			  } 
			  return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(vacinado+"        "+idade+"        "+nome);
		return builder.toString();
	}
}
