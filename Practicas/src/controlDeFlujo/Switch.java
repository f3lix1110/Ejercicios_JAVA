package controlDeFlujo;
import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Elije una opcion: ");
		String enter = s.nextLine();
		
		switch (enter) {
			
		case "1": System.out.println("Elejiste la opcion uno");break;
		
		case "2": System.out.println("Elejiste la opcion dos");break;
		
		default: System.out.println("Eleccion incorrecta");break;
		
		}
	}

}
