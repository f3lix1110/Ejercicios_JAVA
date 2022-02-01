package ControlFlow;
import java.util.Scanner;

public class MovieDiscounts {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la edad: ");
		int edad = scan.nextInt();
		
		if(edad>=5 && edad<60) {
			System.out.println("El costo del boleto es de 7 euros");
		}else if (edad >=0 && edad<5) {
			System.out.println("El costo del boleto es de "+ (7*0.4));
		}else if (edad >=60) {
			System.out.println("El costo del boleto es de "+ (7*0.45));
		}else {
			System.out.println("No ingresaste una edad valida");
		}
		
	}
}
