package atividadeH;

public class pregui�a extends animal{
	
	private String subir;

	public pregui�a(String nome, int idade, String Som, String subir) { // CONSTRUTOR 
		super(nome, idade, Som);
		// TODO Auto-generated constructor stub
		this.subir = subir;
	}

	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
	
	public void imprimirPregui�a() {
		System.out.println("\n Nome:"+getNome()+ "\n Idade:"+ getIdade()+"\nSom: "+getSom()+"\n O que ele gosta de fazer:"+ subir);
	}

}
