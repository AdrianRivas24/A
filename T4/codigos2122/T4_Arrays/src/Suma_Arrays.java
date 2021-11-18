import java.util.Scanner;

public class Suma_Arrays {
	
	public static void main (String[]args) {
		Scanner lecturaTeclado = new Scanner(System.in);
		
		int arrayUno[], arrayDos[], arrayTres[];
		int longitud;
		
		
		
		System.out.println("de q longitud quieres los arrays");
		longitud = lecturaTeclado.nextInt();
		
		arrayUno = new int[longitud];
		arrayDos = new int[longitud];
		arrayTres = new int[longitud];
		
		for (int i = 0; i < longitud; i++) {
			arrayUno[i] = (int)(Math.random()*21);
			arrayDos[i] = (int)(Math.random()*21);		
		}
		for (int i = 0; i < longitud; i++) {
			arrayUno[i] = (int)(Math.random()*21);
			arrayDos[i] = (int)(Math.random()*21);		
		}
		
		lecturaTeclado.close();
	}

}
