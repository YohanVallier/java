package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Exercício03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);;
		Estudante est = new Estudante();
		
		System.out.printf("Me informe as suas três notas %n(sendo a primeira "
				+ "valendo até 30 "
				+ "e a segunda e a terceira até 35)%n");
		est.n1 = sc.nextDouble();
		est.n2 = sc.nextDouble();
		est.n3 = sc.nextDouble();
		
		est.totalPassar();
	}
}
