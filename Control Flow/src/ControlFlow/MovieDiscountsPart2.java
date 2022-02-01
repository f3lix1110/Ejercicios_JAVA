package ControlFlow;
import java.util.Scanner;

public class MovieDiscountsPart2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la edad: ");
		int edad = scan.nextInt();
		System.out.println("Ingresa la cantidad de boletos: ");
		double boletos = scan.nextDouble();
		
		double boleto = 7;
		
		if(edad>=5 && edad<=60) {
			System.out.println("El costo del boleto es de "+boleto);
			if(boletos>=2) {
				boleto*=0.7; //aplicando el 30% de descuento
				System.out.println(" Y el precio total con 30% descuento: "+(boletos*boleto));
			}
		}else if (edad >=0 && edad<5) {
			System.out.println("El costo del boleto es de de "+ (boleto*=0.4));//precio menor de edad con el 60% de descuento
			if(boletos>=2) {
				boleto*=0.7; //aplicando el 30% de descuento
				System.out.println(" Y el precio total con 30% descuento: "+(boletos*boleto));
			}
		}else if (edad>60) {
			System.out.println("El costo del boleto es de "+ (boleto*=0.45));//precio mayor de edad con el 55% de descuento
			if(boletos>=2) {
				boleto*=0.7; //aplicando el 30% de descuento
				System.out.println(" Y el precio total con 30% de descuento: "+(boletos*boleto));
			}
		}else {
			System.out.println("No ingresaste una edad valida");
		}
		
	}
}
