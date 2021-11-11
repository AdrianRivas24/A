
public class Arrays {
	
	public static void main (String[]args) {
		
		// array de numeros
		int[] numeros = new int[10];
		boolean[] aciertos = new boolean[5];
		String[] palabras = new String[3];
		double[] decimales = new double [2];
		
		int [] numeroDos = new int[]{1,2,3,4,5,6,7,8,9,10};
		int longitudArray = numeroDos.length;
		
		//System.out.println(longitudArray);
		//System.out.println(numeroDos[9]);
		
		//sacar todos los valores
		for (int i=0; i <= numeroDos.length - 1; i++) {
			System.out.println(numeroDos[i]);
		}
		
		
	}

}
