package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.idFuncionario;

public class Exercício09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("Quantos funcionários serão registrados? ");
		int funcio = sc.nextInt();
		
		List <Integer> listaId = new ArrayList <Integer>();
		List <Double> listaSal = new ArrayList <Double>();
		List <String> listaNome = new ArrayList <String>();
		for (int i = 0; i < funcio; i++) {
			System.out.printf("Funcionário #%d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double sal = sc.nextDouble();
			System.out.println();
			
			/* idFuncionario  idFun = new idFuncionario(id, nome, sal); */
			
			listaId.add(id);
			listaSal.add(sal);
			listaNome.add(nome);
		}
		
		System.out.print("Informe o Id do funcionário que terá um aumento no salário: ");
		int idSalario = sc.nextInt();
		
		System.out.print("Digite a porcentagem: ");
		double porcent = sc.nextDouble();
		
		for(int i = 0; i < listaId.size(); i++) {
			if(listaId.get(i) == idSalario) {
				listaSal.set(i,(listaSal.get(i) + listaSal.get(i) * (porcent/100)));
			}
		}
		
		System.out.println();
		System.out.println("Lista de Funcionários: ");
		for (int i = 0; i < funcio; i++) {
			System.out.printf("%d, %s, %.2f%n", listaId.get(i), listaNome.get(i), listaSal.get(i));	
		}
		sc.close();
	}
}
