/*
 * Desafío - Patrones
 * Ejercicio 1 - Patrones
 * y
 * Ejercicio 2 - Patrones anidados
 * 
 * 
 */
package com.csgm.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// instanciamos un objeto que nos permite manejar inputs que no necesitamos
		// parsear
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer n;
		Boolean loop = true;

		do {

			System.out.println("Ingrese número de carácteres a mostrar");
			n = Integer.parseInt(sc.next());

			System.out.println("Patrón 1 con n = " + n);
			System.out.println("-----------");
			patron1(n);

			System.out.println();
			System.out.println();
			System.out.println("Patrón 2 con n = " + n);
			System.out.println("-----------");
			patron2(n);

			System.out.println();
			System.out.println();
			System.out.println("Patrón 3 con n = " + n);
			System.out.println("-----------");
			patron3(n);

			System.out.println();
			System.out.println();
			System.out.println("Patrón 4 con n = " + n);
			System.out.println("-----------");
			patron4(n);

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

	private static void patron4(Integer n) {
		int continuar = 1;
		int j = 1;
		if (n == 1) {
			System.out.print("*");
		} else {

			for (int z = 1; z <= n; z++) {

				do {

//						if (z <= n) {
					// System.out.print("*");
					if (!(j == 1 && z > 1) && !(j == n && z < n)) {
						System.out.print("*");
					} else
						System.out.print(" ");
					/*
					 * if (j == 1 && z > 1 ) { System.out.print("X"); } if (j == n && z < n) {
					 * System.out.print("X"); }
					 */
//						} 
					/*
					 * else { if (j == 1 ) { //System.out.print("*"); System.out.print("(" + z + ","
					 * + j + ")"); } else { System.out.print(" "); } }
					 */
					continuar += 1;
					j++;
				} while (continuar <= n);
				continuar = 1;
				j = 1;
				System.out.println();

			}

		}

	}

	private static void patron3(Integer n) {
		int continuar = 1;
		int j = 1;

		if (n == 1) {
			System.out.print("x");
		} else {

			for (int z = 1; z <= n; z++) {

				do {

//					if (z == 1 || (z == n)) {
//						System.out.print("x");
//					} else {
					if ((z + j == n + 1) || z == j) {
						System.out.print("x");
					} else {
						System.out.print(" ");
					}
//					}

					continuar += 1;
					j++;
				} while (continuar <= n);
				continuar = 1;
				j = 1;
				System.out.println();

			}

		}

	}

	private static void patron2(Integer n) {
		int continuar = 1;
		int j = 1;

		if (n == 1) {
			System.out.print("*");
		} else {

			for (int i = 1; i <= n; i++) {

				do {

					if (i == 1 || (i == n)) {
//					System.out.print("(" + i + "," + j + ")");
						System.out.print("*");
					} else {
						if (i + j == n + 1) {
//						System.out.print("(" + i + "," + j + ")");
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}

					continuar += 1;
					j++;
				} while (continuar <= n);
				continuar = 1;
				j = 1;
				System.out.println();
			}
		}

	}

	private static void patron1(Integer n) {

		int continuar = 1;
		int j = 1;

		// patrón 1

		if (n == 1) {
			System.out.print("*");
			System.out.print("");
		} else {

			for (int i = 0; i < n; i++) {

				do {

					if (i == 0 || (i == n - 1)) {

						System.out.print("*");
					} else {
						if (j == 1 || (j == n)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}

					continuar += 1;
					j++;
				} while (continuar <= n);
				continuar = 1;
				j = 1;
				System.out.println();
			}
		}

	}

}