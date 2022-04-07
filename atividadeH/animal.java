package atividadeH;

public class animal { // atributos 

	private String nome;
	private int idade;
	private String Som;
	
	public animal (String nome, int idade, String Som) // metodos construtores
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.Som = Som;
		
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

	public String getSom() {
		return Som;
	}

	public void setSom(String som) {
		Som = som;
	}
	
	
}
