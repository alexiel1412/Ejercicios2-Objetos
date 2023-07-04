package principal;

import java.util.Scanner;

import clases.Cafetera;

public class Ej1_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		Cafetera cafetera1 = new Cafetera();
		System.out.println("Gestión de cafetera 1:");
		
		System.out.println("Capacidad máxima:");
		cafetera1.setCapacidadMaxima(sc.nextInt());
		
		System.out.println("Capacidad actual:");
		cafetera1.setCapacidadActual(sc.nextInt());

		System.out.printf("Cafetera 1:" + cafetera1);


		System.out.println("Gestión de cafetera 2: ");
		Cafetera cafetera2 = new Cafetera(1500);

		System.out.printf("Cafetera 2: " + cafetera2);
		

		System.out.println("Gestión de cafetera 3: ");
		Cafetera cafetera3 = new Cafetera(750, 450);

		System.out.printf("Cafetera 3:" + cafetera3);
		

		int opcion = 0;
		do
		{
			System.out.println("1. Llenar la cafetera.");
			System.out.println("2. Servirse una taza.");
			System.out.println("3. Vaciar la cafetera.");
			System.out.println("4. Agregar café.");
			System.out.println("0. Salir.");
			System.out.println("Introduzca una opción:");
			opcion = sc.nextInt();
			switch (opcion)
			{
				case 1:
					System.out.printf("%s\n", cafetera1);
					System.out.printf("Rellenando la cafetera...\n");
					cafetera1.llenarCafetera();
					System.out.printf("Estado final: %s\n", cafetera1);
					break;
				case 2:
					System.out.printf("%s\n", cafetera1);
					System.out.println("Elija el tamaño de la taza: ");
					int cantidad = sc.nextInt();
					if (cafetera1.servirTaza(cantidad))
						System.out.printf("Taza de %d c.c. servida, %s\n", cantidad, cafetera1);
					else
						System.out.println("Cantidad insuficiente para una taza completa.");
					break;
				case 3:
					System.out.println("Vaciando la cafetera 1: ");
					cafetera1.vaciarCafetera();
					System.out.printf("Estado final: %s\n", cafetera1);
					break;
				case 4:
					System.out.printf("Estado actual: %s\n", cafetera1);
					System.out.println("Elija la cantidad para rellenar: ");
					cantidad = sc.nextInt();
					System.out.printf("Rellenando la cafetera...\n");
					cafetera1.agregarCafe(cantidad);
					System.out.printf("Estado final: %s\n", cafetera1);
					break;
				case 0:
					System.out.printf("Que tenga un buen día.");
					break;
				default:
					System.out.printf("Opción incorrecta.\n");
			}
		} while (opcion != 0);
	}

}
