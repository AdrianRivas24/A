import java.util.Scanner;

public class SumaAristas2 {
	
	public static void main (String[]args) {
		Scanner lecturaTeclado = new Scanner(System.in);
		
		int filas, columnas;
		int numerosAleatorios[][];
		int sumatorioFila1=0, sumatorioFilaN=0, sumatorioColumna1=0, sumatorioColumnaN=0;
		
		
		System.out.println("Cuantas filas tendrá el array");
		filas = lecturaTeclado.nextInt();
		
		System.out.println("Cuantas columnas tendrá el array");
		columnas = lecturaTeclado.nextInt();
		
		numerosAleatorios = new int [filas][columnas];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			//recorro la fila
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				//recorro la columna
				numerosAleatorios[i][j] = (int)(Math.random() * 21);
				System.out.print(numerosAleatorios[i][j]+"\t ");	
			}
			System.out.println();	
		}
		
		int numeroFila=0;
		for (int [] item : numerosAleatorios) {
			System.out.println("fila "+numeroFila);
			//primera fila
			for (int columna : fila) {
				if (numeroFila==0) {
					sumatorioFila1 += columna;	
				}
				
				if (numeroFila == filas - 1) {
					sumatorioFila1 += columna;
				}
			}
			
			//ultima fila
			
			//primera columna
			
			//ultima columna
		}
		
	}		

}
