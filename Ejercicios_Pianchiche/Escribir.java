package Cadena;

import java.util.Scanner;

public class Escribir {

	public static void main(String[] args) {
		String cadena;
        char numCad ;
        String [] mostrar = new String[999999];//Vector
        // proceso
        System.out.println("ingrese una cadena");
        System.out.print("cadena: ");
        Scanner sn = new Scanner(System.in);// hola,HOLA
        cadena =sn.nextLine().toLowerCase();// convierte de mayusculas a minusculas
        //System.out.print(cadena);
        System.out.println(""); // salto de linea
        for (int x=0;x<cadena.length();x++)   { // .charAt(entero)   muestra el caracter Uno tras otro
            System.out.println("Caracter " + x + ": " + cadena.charAt(x));
            //numCad = sn.next();
           switch(cadena.charAt(x)){
               case 'a' :
                  /* System.out.println("*******");
                   System.out.println("*******");
                   System.out.println("**   **");
                   System.out.println("*******");
                   System.out.println("**   **");
                   System.out.println("**   **");*/
                   mostrar[x]="*******\n"
                           +  "*******\n"
                           +  "**   **\n"
                           +  "*******\n"
                           +  "**   **\n"
                           +  "**   **\n";
                   break;
                   case 'b' :
                 
                   mostrar[x]="*******\n"
                           +  "**   **\n"
                           +  "** *** \n"
                           +  "******\n"
                           +  "**   **\n"
                           +  "*******\n";
                   break;
                    case 'c' :
                 
                   mostrar[x]="*******\n"
                           +  "**\n"
                           +  "**\n"
                           +  "**\n"
                           +  "**\n"
                           +  "*******\n";
                   break;
                    case 'd' :
                 
                   mostrar[x]="******\n"
                           +  "**    *\n"
                           +  "**     *\n"
                           +  "**     *\n"
                           +  "**    *\n"
                           +  "******\n";
                   break;
                   case 'e' :
                 
                   mostrar[x]="*******\n"
                           +  "**    \n"
                           +  "*******\n"
                           +  "*******\n"
                           +  "**    \n"
                           +  "*******\n";
                   break;
                   case 'f' :
                 
                   mostrar[x]="*******\n"
                           +  "**    \n"
                           +  "**\n"
                           +  "*****\n"
                           +  "**    \n"
                           +  "**\n";
                   break;
                   case 'g' :
                 
                   mostrar[x]="*******\n"
                           +  "**    \n"
                           +  "**\n"
                           +  "** ***\n"
                           +  "**    *\n"
                           +  "******\n";
                   break;
               case 'h' :
                 /*  System.out.println("**   **");
                   System.out.println("**   **");
                   System.out.println("*******");
                   System.out.println("*******");
                   System.out.println("**   **");
                   System.out.println("**   **");*/
                   mostrar[x]="**   **\n"
                           +  "**   **\n"
                           +  "*******\n"
                           +  "*******\n"
                           +  "**   **\n"
                           +  "**   **\n";
                   break;
                   case 'i' :
                 
                   mostrar[x]="********\n"
                           +  "   **    \n"
                           +  "   **\n"
                           +  "   **\n"
                           +  "   **    \n"
                           +  "********\n";
                   break;
                   case 'j' :
                 
                   mostrar[x]="********\n"
                           +  "   **    \n"
                           +  "   **\n"
                           +  "   **\n"
                           +  "*  **    \n"
                           +  "****\n";
                   break;
                   case 'k' :
                 
                   mostrar[x]="**    **\n"
                           +  "**  **\n"
                           +  "****\n"
                           +  "****\n"
                           +  "**  **\n"
                           +  "**    **\n";
                   break;
                   
                   case 'l' :
                 /*  System.out.println("**");
                   System.out.println("**");
                   System.out.println("**");
                   System.out.println("**");
                   System.out.println("**");
                   System.out.println("*******");*/
                   mostrar[x]="**\n"
                           +  "**\n"
                           +  "**\n"
                           +  "**\n"
                           +  "**\n"
                           +  "*******\n";
                   break;
                   case 'm' :
                 
                   mostrar[x]="**     **\n"
                           +  "***   ***\n"
                           +  "** *** **\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "**     **\n";
                   break;
                   case 'n' :
                 
                   mostrar[x]="**     **\n"
                           +  "***    **\n"
                           +  "** **  **\n"
                           +  "**  ** **\n"
                           +  "**    ***\n"
                           +  "**     **\n";
                   break;
                   case 'ñ' :
                 
                   mostrar[x]="  *****\n"
                           +  "**     **\n"
                           +  "***    **\n"
                           +  "** **  **\n"
                           +  "**  ** **\n"
                           +  "**    ***\n"
                           +  "**     **\n";
                   break;
                   case 'o' :
            /*       System.out.println("*******");
                   System.out.println("*******");
                   System.out.println("**   **");
                   System.out.println("**   **");
                   System.out.println("**   **");
                   System.out.println("*******");*/
                   mostrar[x]="*******\n"
                           +  "**   **\n"
                           +  "**   **\n"
                           +  "**   **\n"
                           +  "**   **\n"
                           +  "*******\n";
                   break;
                   case 'p' :
                 
                   mostrar[x]="*********\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "******* \n"
                           +  "**     \n"
                           +  "**     \n";
                   break;
                    case 'q' :
                 
                   mostrar[x]="*********\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "**   * ** \n"
                           +  "**    ***\n"
                           +  "*********\n"
                           +  "         **\n";
                   break;
                   case 'r' :
                 
                   mostrar[x]="*********\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "** **** \n"
                           +  "**    **\n"
                           +  "**     **\n";
                   break;
                   case 's' :
                 
                   mostrar[x]="   ******\n"
                           +  "  *     \n"
                           +  "  *      \n"
                           +  "   **** \n"
                           +  "       *\n"
                           +  "       *\n"
                           +  " ******\n";
                   break;
                   case 't' :
                 
                   mostrar[x]="********\n"
                           +  "   **    \n"
                           +  "   **\n"
                           +  "   **\n"
                           +  "   **    \n"
                           +  "   **\n";
                   break;
                   case 'u' :
                 
                   mostrar[x]="**     **\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "*********\n"
                           +  " *******\n";
                   break;
                   case 'v' :
                 
                   mostrar[x]="**     **\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  "**     **\n"
                           +  " ******\n"
                           +  "   **\n";
                   break;
                   case 'w' :
                 
                   mostrar[x]="**     **      **\n"
                           +  "**     **      **\n"
                           +  "**     **      **\n"
                           +  "**     **      **\n"
                           +  " ******  ******\n"
                           +  "   **      **\n";
                   break;
                   case 'x' :
                 
                   mostrar[x]="**      **\n"
                           +  " **    **\n"
                           +  "    **\n"
                           +  "    **\n"
                           +  " **    **\n"
                           +  "**      **\n";
                   break;
                   case 'y' :
                 
                   mostrar[x]="**      **\n"
                           +  " **    **\n"
                           +  "    **\n"
                           +  "    **\n"
                           +  "    **\n"
                           +  "    **\n";
                   break;
                   case 'z' :
                 
                   mostrar[x]="*********\n"
                           +  "*********\n"
                           +  "    **\n"
                           +  "  **\n"
                           +  "*********\n"
                           +  "*********\n";
                   break;
                   case ' ' :
                   mostrar[x]=" ";
                       break;
                   
                   
                   default: System.out.print("Ingrese una palabra");
               
           }
           
               
        }
         
     for(int v=0;v<cadena.length();v++){
               System.out.println(mostrar[v]);
           }

	}

}
