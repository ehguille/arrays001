package arrays001;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		int opcion = -1;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Escoge una opción:");
			System.out.println("1) Generar cien números aleatorios.");
			System.out.println("0) Salir.");
			opcion = s.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 1:
				for(int i=0;i<100;i++)
					System.out.println(Ejemplos.generarNumeroAleatorio(3, 9));
				break;
			default:
				System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();

	}

}
