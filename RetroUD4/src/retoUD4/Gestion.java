package retoUD4;
import java.util.Scanner;
public class Gestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id4, id5, horas4, horas5, idavion4, idavion5, cap4, cap5, opcion4, opcion5;
		String nom4, nom5, rango4, rango5, modelo4, modelo5;
		boolean mando4, mando5;
		
		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "Capitán");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");
		
		System.out.println("Introduce el ID, el nombre, las horas de vuelo y el rango de un 4º y un 5º piloto");
		System.out.println("ID del 4º piloto: ");
		id4 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre del 4º piloto: ");
		nom4 = sc.nextLine();
		System.out.println("Horas de vuelo del 4º piloto: ");
		horas4 = sc.nextInt();
		sc.nextLine();
		System.out.println("Rango del 4º piloto: ");
		rango4 = sc.nextLine();
		System.out.println("ID del 5º piloto: ");
		id5 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre del 5º piloto: ");
		nom5 = sc.nextLine();
		System.out.println("Horas de vuelo del 5º piloto: ");
		horas5 = sc.nextInt();
		sc.nextLine();
		System.out.println("Rango del 5º piloto: ");
		rango5 = sc.nextLine(); 
		
		Piloto piloto4 = new Piloto(id4, nom4, horas4, rango4);
		Piloto piloto5 = new Piloto(id5, nom5, horas5, rango5);
		
		System.out.println("\n-- PILOTO 1 --\n");
		piloto1.mostrarPiloto();
		System.out.println("\n-- PILOTO 3 --\n");
		piloto3.mostrarPiloto();
		System.out.println("\n-- PILOTO 4 --\n");
		piloto4.mostrarPiloto();
		System.out.println("\n-- PILOTO 5 --\n");
		piloto5.mostrarPiloto();
		
		Entrenamiento entrenamiento1 = new Entrenamiento(1, "Boeing F-22 Raptor", 2, piloto4, true);
		Combate combate2 = new Combate(2, "Boeing F-22 Raptor", 1, piloto1, true);
		Combate combate3 = new Combate(3, "Boeing F-22 Raptor", 1, piloto2, true);
		
		System.out.println("\nIntroduce, el ID, el modelo, la capacidad y si tiene doble mando, de un 4º y un 5º avión, que serán de entrenamiento");
		System.out.println("ID del 4º avión: ");
		idavion4 = sc.nextInt();
		sc.nextLine();
		System.out.println("Modelo del 4º avión: ");
		modelo4 = sc.nextLine();
		System.out.println("Capacidad del 4º avión: ");
		cap4 = sc.nextInt();
		sc.nextLine();
		System.out.println("Doble mando del 4º avión, ¿Sí (escribre true) o No (escribe false)?: ");
		mando4 = sc.nextBoolean();
		System.out.println("ID del 5º avión: ");
		idavion5 = sc.nextInt();
		sc.nextLine();
		System.out.println("Modelo del 5º avión: ");
		modelo5 = sc.nextLine();
		System.out.println("Capacidad del 5º avión: ");
		cap5 = sc.nextInt();
		sc.nextLine();
		System.out.println("Doble mando del 5º avión, ¿Sí (escribe true) o No (escribe false)?: ");
		mando5 = sc.nextBoolean();
		
		Entrenamiento entrenamiento4 = new Entrenamiento(idavion4, modelo4, cap4, piloto1, mando4);
		
		System.out.println("¿Qué piloto manejará el 4º avión? (Indica con un número 1-5): ");
		opcion4 = sc.nextInt();
		switch(opcion4) {
		case 1 : entrenamiento4.setPiloto(piloto1);
		break;
		case 2: entrenamiento4.setPiloto(piloto2);
		break;
		case 3: entrenamiento4.setPiloto(piloto3);
		break;
		case 4: entrenamiento4.setPiloto(piloto4);
		break;
		default: entrenamiento4.setPiloto(piloto5);
		}
		
		Entrenamiento entrenamiento5 = new Entrenamiento(idavion5, modelo5, cap5, piloto2, mando5);
		
		System.out.println("¿Qué piloto manejará el 5º avión) (Indica con un número 1-5): ");
		opcion5 = sc.nextInt();
		switch(opcion5) {
		case 1 : entrenamiento5.setPiloto(piloto1);
		break;
		case 2: entrenamiento5.setPiloto(piloto2);
		break;
		case 3: entrenamiento5.setPiloto(piloto3);
		break;
		case 4: entrenamiento5.setPiloto(piloto4);
		break;
		default: entrenamiento5.setPiloto(piloto5);
		}
		
		System.out.println("\n-- AVIÓN 1 --\n");
		entrenamiento1.mostrarAvion();
		System.out.println("\n-- AVIÓN 2 --\n");
		combate2.mostrarAvion();
		System.out.println("\n-- AVIÓN 3 --\n");
		combate3.mostrarAvion();
		System.out.println("\n-- AVIÓN 4 --\n");
		entrenamiento4.mostrarAvion();
		System.out.println("\n-- AVIÓN 5 --\n");
		entrenamiento5.mostrarAvion();
		
		sc.close();
	}

}
