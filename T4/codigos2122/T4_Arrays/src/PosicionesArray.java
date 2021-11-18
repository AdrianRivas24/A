import java.util.Scanner;

public class PosicionesArray {
	
	public static void main (String[]args) {
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		int primero= numeros [0];
		int ultimo = numeros[numeros.length -1];
		
		for (int i = numeros.length-1; i== 0; i++) {
			numeros[i] = numeros [i-1];
		}
		numeros[0]=primero;
		
		for ( int item : numeros) {
			System.out.println(item+"");
		}
		
	}

}
