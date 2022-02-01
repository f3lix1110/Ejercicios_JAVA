package LogicOperators;
import java.util.Scanner;

public class ClassGrader {
	public static void main(String[] args) {
			try (Scanner scann = new Scanner(System.in)) {
				//Ingresar nombre y edades
				System.out.println("Ingresa tu calificacion: ");
				int score = scann.nextInt();
				
				if(score<=3&&score>0) {
					System.out.println("Failed");
				}else if(score>3&&score<=5) {
					System.out.println("Insufficient");
				}else if(score>5&&score<=8) {
					System.out.println("Good");
				}else if(score==10) {
					System.out.println("Excellent Grade");
				}else {
					System.out.println("Error");
				}
			}
	}
}
