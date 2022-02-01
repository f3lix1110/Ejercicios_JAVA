package Bucles;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		String[] cars = {"Volvo","BMW","Ford"};
		float[] num = {1.3f,2.3f,4.3f,2.5f};
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for(String u : cars) {
			System.out.println(u);
		}
		
		System.out.println("\n");
		
		for(float p : num) {
			System.out.println(p);
		}
	}

}
