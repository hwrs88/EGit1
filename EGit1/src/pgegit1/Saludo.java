package pgegit1;

public class Saludo {

	public static void hola() {

		System.out.println("Hola");

	}

	public static void hello() {

		System.out.println("Hello");

	}

	public static void holaTodos() {

		System.out.println("Hola Todos!");

	}

	public static void buenDia(boolean generalizado) {

		if (generalizado) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buen dia");
		}

	}
	
}
