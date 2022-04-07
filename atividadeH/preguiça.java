package atividadeH;

public class preguiça extends animal{
	
	private String subir;

	public preguiça(String nome, int idade, String Som, String subir) { // CONSTRUTOR 
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
	
	public void imprimirPreguiça() {
		System.out.println("\n Nome:"+getNome()+ "\n Idade:"+ getIdade()+"\nSom: "+getSom()+"\n O que ele gosta de fazer:"+ subir);
	}

}
