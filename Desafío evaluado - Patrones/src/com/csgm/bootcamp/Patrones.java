package com.csgm.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// instanciamos un objeto que nos permite manejar inputs que no necesitamos
		// parsear
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer n = 0;
		Integer continuar = 1;

		Boolean loop = true;

		do {

			do {
				System.out.println("Ingrese número de carácteres a mostrar");
				try {
					n = Integer.parseInt(sc.next());
					loop = true;
				} catch (Exception e) {
					System.out.println("Un error a ocurrido...");
					loop = false;
				}

			} while (!loop);

			System.out.println("Patrón 1");
			System.out.println("--------");

			continuar = 1;
			do {
				// patrón *.*.*.*.*.*.*
				if ((continuar % 2) == 1) {
					System.out.print("*");
				} else
					System.out.print(".");

				continuar += 1;
			} while (continuar <= n);

			System.out.println();
			System.out.println();
			System.out.println("Patrón 2");
			System.out.println("--------");

			continuar = 1;
			do {
				// patrón 12341234

				/*
				 * if( (continuar % 4) == 1 ) System.out.print("1"); if( (continuar % 4) == 2 )
				 * System.out.print("2"); if( (continuar % 4) == 3 ) System.out.print("3"); if(
				 * (continuar % 4) == 0 ) System.out.print("4");
				 */

				if ((continuar % 4) != 0) {
					System.out.print(continuar % 4);
				} else
					System.out.print("4");

				continuar += 1;
			} while (continuar <= n);

			System.out.println();
			System.out.println();
			System.out.println("Patrón 3");
			System.out.println("--------");

			continuar = 1;
			do {
				// patrón ||*||*||*||*

				if ((continuar % 3) == 1)
					System.out.print("|");
				if ((continuar % 3) == 2)
					System.out.print("|");
				if ((continuar % 3) == 0)
					System.out.print("*");

				continuar += 1;
			} while (continuar <= n);

			System.out.println();
			System.out.println();
			System.out.println("Presione enter, para volver a ejecutar el programa nuevamente...");

			try {
				input.readLine();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (loop);

		sc.close();
	}

}
