package entities;

public class Estudante {
	public double n1;
	public double n2;
	public double n3;
	
	public void totalPassar() {
		double resultado = n1 + n2 + n3;
		
		if(resultado >= 60) {
			System.out.printf("Sua nota final foi: %.2f%nVocê passou!", resultado);
		}
		
		else {
			double quantoFalta = 60 - resultado;
			System.out.printf("Sua nota final foi: %.2f%nVocê precisa de %.2f pontos para passar%nReprovado!", resultado, quantoFalta);
		}
	}
}
