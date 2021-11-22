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
            System.out.println("Por favor introduce numero");
            int numeroInto = lecturaTeclado.nextInt();
            numeros[i] = numeroInto;
        }

        System.out.println("Desordenados");

        for ( int item: numeros) {
            System.out.println(item);
        }

        System.out.println("Ordenados");

        Arrays.sort(numeros);

        for ( int item: numeros) {
            System.out.println(item);
        }

        System.out.println("El mayor es "+numeros[numeros.length-1]);
        System.out.println("El menor es "+numeros[0]);


		lecturaTeclado.close();
	}

}
