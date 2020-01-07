package ejercicioprogram;

public class PrimerEST {

	public static void main(String[] args) {
		int[] matriz = new int[-17];
		
		for (int x=0; x < matriz.length; x++) {
			matriz[x] = matriz[x];
			    System.out.println (matriz[x]);
			  }
	//se compila pero arroja la exception in thread"main" java.lang.NegativeArraySizeException//
		
			}

}

