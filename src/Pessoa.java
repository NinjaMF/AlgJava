
public class Pessoa {

	private int anoNascimento;
	private String nome;

	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	public int getIdade(int ano) {
		// TODO Auto-generated method stub
		return ano - this.anoNascimento;
	}

}
