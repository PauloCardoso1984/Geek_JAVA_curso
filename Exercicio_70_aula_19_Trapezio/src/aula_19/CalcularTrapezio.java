package aula_19;

public class CalcularTrapezio {
	
	public double baseMaior;
	public double baseMenor;
	public double altura;
	
	public CalcularTrapezio() {
	}

	public CalcularTrapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	
	// METODO PARA CALCULAR AREA
	public double area () {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	public double perimetro() {
		double cateto = baseMaior - baseMenor;
		double resultadoHipotenusa = Math.sqrt((cateto * cateto) + (altura * altura));
		return (resultadoHipotenusa + baseMaior + baseMenor + altura);
	}	
}
