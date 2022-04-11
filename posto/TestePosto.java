package posto;
import java.util.Scanner;

public class TestePosto {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			String nome = leia.nextLine();
			System.out.print("Digite sua função: ");
			String funcao = leia.nextLine();
			System.out.print("Digite seu setor: ");
			String setor = leia.nextLine();
			System.out.print("Informe seu local de trabalho: ");
			String localTrabalho = leia.nextLine();
			System.out.print("Informe seu salário: ");
			Double salario = leia.nextDouble();
			
			Funcionarios func = new Funcionarios(nome, funcao, setor, localTrabalho, salario);
			
			System.out.println("\n");
			System.out.println("\n");
			
			func.imprimeCartao(func);					
		}
	}


