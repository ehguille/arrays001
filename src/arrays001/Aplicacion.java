package arrays001;

import java.util.Scanner;

public class Aplicacion {
	

	public Aplicacion() {
		int opcion = -1;
		int array1[]={7,8,4,1,2};
		int array2[]= {1,2,4,7,8};
		int array3[]= {5,4,3,2,-1};
		Ejemplos.introducirEntero(6, array2);
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Escoge una opción:");
			System.out.println("1) Generar cien números aleatorios.");
			System.out.println("2) Imprimir array predefinido.");
			System.out.println("3) Imprimir lista de personas.");
			System.out.println("4) Imprimir array de enteros aleatorios.");
			System.out.println("5) Imprimir array de personas indeterminadas.");
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
			case 2:
				Ejemplos.imprimirArrayEnterosPredefinido();
				break;
			case 3:
				Ejemplos.imprimirArrayCuatroPersonas();
				break;
			case 4:
				Ejemplos.imprimirArrayEnterosAleatorios(10);
				break;
			case 5:
				Ejemplos.imprimirArrayPersonasIndeterminadas(3);
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
