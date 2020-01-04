package com.pucese.tics;


import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float promedio = 0;
		float suma = 0;
		int mayor = 0;
		int menor = 0;
		
		System.out.println("Ingrese la cantidad de estudiantes");
		int n = entrada.nextInt();

		int[] miArreglo = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese la nota del estudiante" + (i) + " :");
			miArreglo[i] = entrada.nextInt();
		}
		// realizar la suma, promedio y el mayor a
		for (int i = 0; i < miArreglo.length; i++) {
			suma += miArreglo[i];				
		}
		//promedio
        promedio = suma / miArreglo.length;
		// buscar los mayores al promedio
		for (int i = 0; i < miArreglo.length; i++) {
			if (miArreglo[i]>promedio) {
				System.out.println(String.format("El número %d es mayor que el promedio %d",
						miArreglo[i],promedio));
			}
		}
		System.out.println("***Salida***");

		System.out
				.println(String
						.format("La suma es %.2f, el promedio es %.2f",
								suma, promedio));
	}

}
