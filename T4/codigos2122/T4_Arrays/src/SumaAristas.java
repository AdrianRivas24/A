import java.util.Scanner;

public class SumaAristas {
	
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
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				if (i==0) {
					sumatorioFila1 += numerosAleatorios[i][j];
				}
				if (i==filas - 1) {
					sumatorioFilaN += numerosAleatorios[i][j];
				}
				if (j==0) {
					sumatorioColumna1 += numerosAleatorios[i][j];
				}
				if (j==columnas - 1) {
					sumatorioColumnaN += numerosAleatorios[i][j];
				}
			}	
		}
		System.out.println("la suma de la primera fila es: "+sumatorioFila1);
		System.out.println("la suma de la ultima fila es: "+sumatorioFilaN);
		System.out.println("la suma de la primera columna es: "+sumatorioColumna1);
		System.out.println("la suma de la ultima columna es: "+sumatorioColumnaN);
	lecturaTeclado.close();
	}

}
