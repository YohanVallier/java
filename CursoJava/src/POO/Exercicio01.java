package POO;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		
		System.out.print("Insira a largura retângulo: ");
		ret.largura = sc.nextDouble();
		System.out.print("Insira a altura retângulo: ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("%nArea = %.1f%n", ret.area());
		System.out.printf("Perimetro = %.1f%n", ret.perimetro());
		System.out.printf("Diagonal = %.1f", ret.diagonal());
		sc.close();
	}

}
