import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		//double  valor = 0.3;
		//System.out.println(valor+valor+valor);
		//integer numeroB = 5;
		
		BigDecimal numeroA = new BigDecimal("5");
		BigDecimal numeroB = new BigDecimal("27");
		
		System.out.println("Subtração");
		System.out.println(numeroA.subtract(numeroB));
		
		System.out.println("\n Adição");
		System.out.println(numeroA.add(numeroB));
		
		System.out.println("\n Comparação");
		System.out.println(numeroA.compareTo(numeroB));
		
		System.out.println("\n Divisão");
		System.out.println(numeroA.divide(numeroB,4,RoundingMode.UP));
	
		System.out.println("\n Maximo");
		System.out.println(numeroA.max(numeroB));
		
		System.out.println("\n Minimo");
		System.out.println(numeroA.min(numeroB));
		
		System.out.println("\n potencia");
		System.out.println(numeroA.pow(5));
		
		System.out.println("\n Multiplicação");
		System.out.println(numeroA.multiply(numeroB));
		
		System.out.println("\n Inverte Negativo");
		System.out.println(numeroA.negate());
		
		System.out.println("\n Absoluto");
		System.out.println(numeroA.abs());	
		
		
		//System.out.println(numeroA.add(numeroA).add(numeroA));
		//System.out.println(numeroA.add(new BigDecimal(numeroB)));
	}

}
