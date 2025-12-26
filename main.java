// Programa de ejemplo: muestra conceptos básicos de Java
class Main {
	public static void main(String[] args) {
		System.out.println("Hola — este programa muestra cómo funciona Java.");

		// Variables primitivas y objetos
		int numero = 7;
		double decimal = 3.14;
		String texto = "Ejemplo de texto";
		System.out.printf("Entero: %d, Double: %.2f, String: %s\n", numero, decimal, texto);

		// Arreglos y bucles
		int[] arr = {1, 2, 3, 4, 5};
		System.out.print("Array: ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();

		// Llamada a método estático
		int suma = sumar(3, 5);
		System.out.println("Sumar 3 + 5 = " + suma);

		// Uso de una clase/objeto
		Persona p = new Persona("Ana", 30);
		p.saludar();

		// Estructuras de control
		if (numero % 2 == 0) {
			System.out.println(numero + " es par");
		} else {
			System.out.println(numero + " es impar");
		}

		// Bucle while
		int i = 0;
		while (i < 3) {
			System.out.println("Iteración " + i);
			i++;
		}
	}

	static int sumar(int a, int b) {
		return a + b;
	}
}

// Clase simple que representa una persona y muestra métodos de instancia
class Persona {
	String nombre;
	int edad;

	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void saludar() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	}
}

