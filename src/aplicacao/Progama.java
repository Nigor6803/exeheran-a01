package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Contribuinte;
import entidade.Individual;
import entidade.Juridica;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		List <Contribuinte> lista = new ArrayList<>();
		
		System.out.print("CONTIBUINTE:");
		int n = edd.nextInt();
		
		for (int i = 1; i <= n;i++) {
			System.out.println("DADOS DO CONTRIBUINTE Nº"+i);
			
			System.out.print("FISICO OU JURIDICO:(F/J)");
			char ch = edd.next().charAt(0);
			System.out.print("NOME:");
			edd.nextLine();
			String nome = edd.nextLine();
			System.out.print("RENDIMENTO ANUAL:");
			double rendimentoAnual = edd.nextDouble();
			
			if(ch == 'F') {
				
				System.out.print("DESPESA COM SAÚDE");
				double depesaComSaude = edd.nextDouble();
				lista.add(new Individual(nome,rendimentoAnual,depesaComSaude));
			}
			else {
				System.out.print("NÚMERO DE EMPREGADOS:");
				int numeroDeEmpregados = edd.nextInt();
				lista.add(new Juridica(nome,rendimentoAnual,numeroDeEmpregados));
			}
}
		
		System.out.println("IMPOSTO PAGO");
		for(Contribuinte contribuinte : lista) {
			System.out.println();
					
			System.out.println("CLIENTE: "+contribuinte.getNome());
			System.out.println("CONTRIBUIÇÃO: R$"+String.format("%.2f",contribuinte.taxa()));
		}
		System.out.println();
		double som = 0.0;
		for(Contribuinte contribuinte : lista) {
			som += contribuinte.taxa();
			}
		System.out.println("TOTAL DAS TAXAS: R$"+String.format("%.2f",som));
		edd.close();
	}
}