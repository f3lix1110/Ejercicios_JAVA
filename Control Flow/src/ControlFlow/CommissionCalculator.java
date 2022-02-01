package ControlFlow;
import java.util.Scanner;

public class CommissionCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la cantidad: ");
		double cantidad = scan.nextDouble();
		
		if(cantidad >= 10000) {
			System.out.println("su comision es de "+cantidad*0.3);
		}else if(cantidad >= 5000 && cantidad <= 9999) {
			System.out.println("su comision es de "+cantidad*0.2);
		}else if(cantidad >= 1000 && cantidad <= 4999) {
			System.out.println("su comision es de "+cantidad*0.1);
		}else {
			System.out.println("N/A");
		}
	}

}
