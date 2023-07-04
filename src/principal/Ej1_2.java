package principal;

import java.util.Scanner;

import clases.Cafetera;

public class Ej1_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int capMax, capAct;

		// CAFETERA 1
		Cafetera cafetera1 = new Cafetera();
		System.out.println("Gestión de cafetera 1:");

		System.out.printf("Cafetera 1:" + cafetera1);

		// CAFETERA 2
		System.out.println("Gestión de cafetera 2: ");
		
		System.out.println("Capacidad máxima:");
		capMax = sc.nextInt();
		
		Cafetera cafetera2 = new Cafetera(capMax);

		System.out.printf("Cafetera 2: " + cafetera2);
		
		// CAFETERA 3
		System.out.println("Gestión de cafetera 3: ");
		
		System.out.println("Capacidad máxima:");
		capMax = sc.nextInt();
		
		System.out.println("Capacidad actual:");
		capAct = sc.nextInt();
		
		Cafetera cafetera3 = new Cafetera(capMax, capAct);

		System.out.printf("Cafetera 3:" + cafetera3);
		
		
		int opcion = 0;
		Cafetera cafetActual = cafetera1;
		do
		{
			System.out.println("---------------\nSelecccione la cafetera a usar: \n");
			System.out.printf("1. Saimaza. %s", cafetera1);
			System.out.printf("2. Bonka. %s", cafetera2);
			System.out.printf("3. Kopiluwok. %s", cafetera3);
			opcion = sc.nextInt();
			switch (opcion)
			{
				case 1:
					cafetActual = cafetera1;
					break;
				case 2:
					cafetActual = cafetera2;
					break;
				case 3:
					cafetActual = cafetera3;
					break;
				case 0:
					System.out.printf("Que tenga un buen día.");
					break;
				default:
					System.out.printf("Opción incorrecta.\n");
			}
			if (opcion != 0)
			{
				int opcion2 = 0;
				do
				{
					System.out.println("1. Llenar la cafetera.");
					System.out.println("2. Servirse una taza.");
					System.out.println("3. Vaciar la cafetera.");
					System.out.println("4. Agregar café.");
					System.out.println("0. Salir.");
					System.out.println("Introduzca una opción:");
					opcion2 = sc.nextInt();
					switch (opcion2)
					{
						case 1:
							System.out.printf("%s\n", cafetActual);
							System.out.printf("Rellenando la cafetera...\n");
							cafetActual.llenarCafetera();
							System.out.printf("Estado final: %s\n", cafetActual);
							break;
						case 2:
							System.out.printf("%s\n", cafetActual);
							System.out.println("Elija el tamaño de la taza: ");
							int cantidad = sc.nextInt();
							if (cafetActual.servirTaza(cantidad))
								System.out.printf("Taza de %d c.c. servida, %s\n", cantidad, cafetActual);
							else
								System.out.println("Cantidad insuficiente para una taza completa.");
							break;
						case 3:
							System.out.println("Vaciando la cafetera 1: ");
							cafetActual.vaciarCafetera();
							System.out.printf("Estado final: %s\n", cafetActual);
							break;
						case 4:
							System.out.printf("Estado actual: %s\n", cafetActual);
							System.out.println("Elija la cantidad para rellenar: ");
							cantidad = sc.nextInt();
							System.out.printf("Rellenando la cafetera...\n");
							cafetActual.agregarCafe(cantidad);
							System.out.printf("Estado final: %s\n", cafetActual);
							break;
						case 0:
							System.out.println("Cambiando de cafetera...\n");
							break;
						default:
							System.out.printf("Opción incorrecta.\n");
					}
				} while (opcion2 != 0);
			}
		} while (opcion != 0);
	}

}
