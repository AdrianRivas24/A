
public class Ejercicio15_T4 {
	
	public static void main (String[]args) {
		
		Object[][] alumnos = new Object[3][5];
		alumnos[0][0] = "Borja";
		alumnos[0][1] = 6;
		alumnos[0][2] = 5;
		alumnos[0][3] = 7;
		alumnos[0][4] = false;
		
		alumnos[1][0] = "Pedro";
		alumnos[1][1] = 4;
		alumnos[1][2] = 7;
		alumnos[1][3] = 9;
		alumnos[1][4] = true;
		
		alumnos[2][0] = "Jose";
		alumnos[2][1] = 7;
		alumnos[2][2] = 1;
		alumnos[2][3] = 2;
		alumnos[2][4] = true;
		
		String nombre = alumnos[0][0];
		double media = ((double)((int)alumnos[0][1] + (int)alumnos[0][2] + (int)alumnos[0][3])/3);
		boolean conv = (boolean)(alumnos[0][alumnos[0].length-1]);
		System.out.printf("%s tiene una media de %.2f y tiene asignaturas convalidadas", nombre, media);
		System.out.printf("%s tiene una media de %.2f y no tiene asignaturas convalidadas", nombre, media);
		
	}

}
