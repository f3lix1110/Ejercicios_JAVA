package Bucles;

public class Break {
		
	public static void main(String[] args) {
		
		/*for(int i=0;i<10;i++) {
			
			//System.out.println(i); //recordar en esta posicion todavia imprimiria el 4
			if(i==4) {
				break;//saldra del bucle, el break detiene
			}
			System.out.println(i);  
			
			if(i==4) {
				continue;//no imprimira el 4 y continuara
			}
			System.out.println(i); 
			
		} */
		
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		
				if(i==4) {
					break;
				}
		}
	}
}	
