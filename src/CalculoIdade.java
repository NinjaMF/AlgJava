import com.senac.SimpleJava.Console;

public class CalculoIdade {

		public void run() {
			
			int ano = Console.readInt("Ano Atual:");
			Pessoa pessoa = lePessoa();
			Console.println(pessoa.getNome(), "voce tem ", pessoa.getIdade(ano), " anos de vida."   );
			
			
		}

		private Pessoa lePessoa() {
			
			String nome = Console.readLine("Seu nome :");
			int anoNascimento = Console.readInt("Ano de Nascimento:");
			return new Pessoa(nome, anoNascimento);
		}
	
}
