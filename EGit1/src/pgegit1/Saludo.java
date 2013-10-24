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
	
	public static void buenaTarde(boolean generalizado){
		
		if(generalizado){
			System.out.println("Buenas tardes");
		}else{
			System.out.println("Buena tarde");
		}
		
	}
	
	public static void buenaNoche(boolean generalizado){
		
		if(generalizado){
			System.out.println("Buenas noches");
		}else{
			System.out.println("Buena noche");
		}
		
	}
	
	
	public static void hiThere(){
		
		System.out.println("Hi there!...");
		
	}
	
	
}
