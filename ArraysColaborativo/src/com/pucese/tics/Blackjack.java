package ejercicioprogram;
import java.util.*;
import javax.swing.JOptionPane;

public class Blackjack {

	private static Scanner userInput;

	public static void main(String[] args) {
	 Random randomGenerator=new Random();
	 String repetir="si";
	 //digita las cartas que quieres con cada uno de las jugadas
	 String num1=new String(JOptionPane.showInputDialog("Esta de acuerdo en que aparesca el repartidor si/no"));
	 int num=Integer.parseInt(JOptionPane.showInputDialog("Dijite los jugadores de la mesa"));
	 System.out.println("Bienvenido al casino Atlantic city");
	 int carta[]=new int [num];
	 int carta2[]=new int [num];
	 int mb=0,mp=0,ms=0;
	 String mano[]=new String[num];
	 
	 for(int x=0;x<=num;x++) {
		 int aleatorio= randomGenerator.nextInt(10)+1;
		 carta[x]=aleatorio;
		 aleatorio=randomGenerator.nextInt(10)+1;
		 carta2[x]=aleatorio;
		 //si la carta1 y carta2 son mayor a 16 imprime mano buena
		 if (carta[x]+carta2[x] >16) {
			 mano[x]="buena";
			 mb=mb+1;
		 }else {
			 mano[x]= "mala";	 
		 }
		//si la carta1 y carta2 son iguales a 21 imprime mano perfecta
		 if(carta[x]+carta2[x]==21) {
			 mano[x]= "perfecta";
			 mp=mp+1;
		 }
		 System.out.println("Tu primera carta fue :"+carta[x]+"\nTu segunda carta fue:" +carta2[x]+"\nEsto da un total de:" +(carta[x]+carta2[x])+"\n Lo que convierte a tu mano en una mano" +mano[x]);
		 System.out.println("Hubieron"+mb+"manos buenas y"+mp+"manos perfectas");
		 {
		 userInput = new Scanner(System.in);
		 
		 System.out.println("Le gustaría (1) golpear o (2) pararse");
			int response = userInput.nextInt();	
			//si responde uno va a barajar cartas otra vez
			if(response == 1){
				
				System.out.printf("Golpeo: 1 vez");
				if (carta[x]+carta2[x]<21) {
					System.out.printf("perdio el juego porque");
				}
				}
		
			if(response == 2){
				ms=mb+mp;
				 System.out.println("Total de manos buenas, perfectas y cartas duplicadas"+ms);
				 if (carta[x]+carta2[x]<21) {
						System.out.printf("perdio el juego ");
					} 
			}
			
	 }
		 repetir=JOptionPane.showInputDialog("has pertido deseas continuar"
		 		+ "");
		}while (repetir.equals("si"));
	 
	}
	
}





