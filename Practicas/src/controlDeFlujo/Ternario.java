package controlDeFlujo;
import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una edad: ");
		int age = scan.nextInt();
		
		//System.out.println( age>=18 ? "Eres mayor de edad" : "Eres menor de edad");
		
		System.out.println( age>=18 && age<=150 ? "Eres mayor de edad" : 
		age>0 && age < 18 ? "Eres menor de edad" : "Valor fuera de rango");

	}

}
