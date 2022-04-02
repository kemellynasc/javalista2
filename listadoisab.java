package kekaproject;

import java.util.Scanner;

public class listadoisab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 int dia, mes, ano, idadeD;
    	 
    	 Scanner leia = new Scanner(System.in);
    	 
    	 System.out.println("\nDigite sua idade em anos meses e dias: \nAnos");
    	 ano=leia.nextInt();
    	 System.out.println("\nMeses: ");
    	 mes=leia.nextInt();
    	 System.out.println("\nDias:");
    	 dia=leia.nextInt();
    	 
    	 ano=365 * ano;
    	 mes=30 * mes;
    	 idadeD= ano + mes + dia;
    	 
    	 System.out.println("\nVocê tem o total de: "+ idadeD +"dias de vida");
    	 
	}

}
