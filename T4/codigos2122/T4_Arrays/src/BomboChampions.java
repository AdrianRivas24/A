
public class BomboChampions {
	
	public static void main (String[]args) {
		
		String[] bomboUno= {"Barcelona","PSG","Bayern","ManCity","Juventus","Leizpzig","Valencia","Liverpool"};
		String[] bomboDos= {"Real Madrid","Tottenham","N�poles","B. Dortmund","O. Lyon","Chelsea","Atalanta","Atl�tico"};
		
		String[] equiposSalidosB1 = new String [bomboUno.length];
		String[] equiposSalidosB2 = new String [bomboDos.length];
		
		for (int i = 0; i < bomboDos.length; i++) {
			int aleatorioUno = (int) (Math.random()*bomboUno.length);
			int aleatorioDos = (int) (Math.random()*bomboUno.length);
			String equipoGenerado1 = bomboUno [aleatorioUno];
			String equipoGenerado2 = bomboDos [aleatorioDos];
			
			for (int x = 0; x < equiposSalidosB1.length; x++) {
				if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[1])) {
					aleatorioUno = (int) (Math.random()*bomboUno.length);
				}
				
			}
		}
	}
	

}
