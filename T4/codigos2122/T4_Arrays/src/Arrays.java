public class Arrays {
	
	public static void main (String[]args) {
		
		//meter en un array de 15 posiciones, 15 numeros aleatorios entre el 0 - 50
		int [] numero = new int [15];
		
		for (int i = 0; i < 15; i++) {
			numero [i] = (int)(Math.random()*51);
			System.out.println(numero);
		}
		
	//una vez generados los numeros indicar cuantos pares e impares hay en la coleccion
		int pares = 0, impares = 0;
		for (int i = 0; i < 15; i++) {
			if (numero[i] %2 == 0) {
				System.out.println("El numero es par");
			}
				
			else {
					System.out.println("El numero es impar");		
			}
				
		}
	
	}

}

    

