
public class Multidimensionales {
	
	public static void main (String[]args) {
		
		int [][] arrayMulti = new int [3][3];
		arrayMulti[0][0] = 7;
		arrayMulti[2][1] = 8;
		arrayMulti[1][2] = 6;
		
		for (int i=0;i<arrayMulti.length;i++){
			System.out.printf("%d%n",i);
			
			for (int j = 0; j<arrayMulti[i].length;j++){
				System.out.printf("%d%n",arrayMulti[i][j]);
			}

	    }
	}
}
