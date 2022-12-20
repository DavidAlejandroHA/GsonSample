package dad.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class gsonsample {

	public static void main(String[] args) {
		int error = 0;
		persona p = new persona();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		p.setNombre(scanner.nextLine());
		System.out.println("Dime tus Apellidos: ");
		p.setApellidos(scanner.nextLine());

		try {
			System.out.println("Dime tu Edad: ");
			p.setEdad(Integer.parseInt(scanner.nextLine()));
			scanner.close();
		} catch (NumberFormatException s) {
			error = 1;
			System.out.println("Error. No se ha introducido un número.");
		}

		if (error != 1) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(p);
			System.out.println(json);
		}
	}

}
