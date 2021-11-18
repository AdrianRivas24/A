import java.util.Scanner;

public class Ejercicio4T4 {
	
	public static void main (String[]args){
		Scanner lecturaTeclado = new Scanner(System.in);
		
		int longitud;
		int[] numeros;
		int maximo=-99999, minimo=99999;
		
		System.out.println("de q longitud quieres crear el array?");
		longitud = lecturaTeclado.nextInt();
		numeros = new int[longitud];
		
		for (int i = 0; i < numeros.length; i++) {
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]<minimo) {
				minimo = numeros[i];}
			
			if (numeros[i]<maximo) {
				maximo = numeros[i];}
			
			
		
		
		lecturaTeclado.close();
	}

}
