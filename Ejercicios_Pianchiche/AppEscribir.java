package Cadena;
import java.util.Scanner;
public class AppEscribir {

	public static void main(String[] args) {
		int i,j,k;
        int count=-1;
        for(i=0;i<9;i++){
            System.out.println("");
            for(k=9-i;k>0;k--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>0){
                if(i<=8){
                    count++;
                }
                for(j=i+count;j>0;j--){
                    if(j==1){
                        System.out.print(" ");
                        System.out.print("*");
                    }
                    else if(i==4){
 
                            System.out.print("*");
 
                    }
                    else
                        System.out.print(" ");
                }
            }
        }

	}

}
