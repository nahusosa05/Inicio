class Persona {
    // Atributos
    String nombre;
    String direccion;
    int edad;

    // Constructor
    public Persona(String n,String d ,int e) {
        this.nombre = n;
        this.direccion = d;
        this.edad = e;
    }

    // Método
    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class principal
{
	public static void main(String[] args)
	{
		Persona persona1 = new Persona("Juan","Av. Castañares 4273",30);
		persona1.saludar();
		
		String s = "Hola como estas";
        System.out.println(s);
	}
}
