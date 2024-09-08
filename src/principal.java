class Persona 
{
    // creo los campos de persona
    String nombre;
    int edad;
    String direccion;

    // funcion de inicializacion de Persona
    public Persona(String n,String d ,int e) 
    {
        this.nombre = n;
        this.direccion = d;
        this.edad = e;
    }

    void saludar(Persona p) 
    {
        System.out.println("Hola " + p.nombre + " - Tu edad: " +  p.edad + " y tu direccion es: " + p.direccion );
    }
}

// main 
public class principal
{
	public static void main(String[] args)
	{
        //declaro persona1 como tipo de dato(clase) Persona
		Persona persona1 = new Persona("Nahuel","Av. Castañares 4273",20);
		persona1.saludar(persona1);

        String h = "hola";
        for(int i =0; i<h.length();i++)
        {
            char c = h.charAt(i);
            System.out.println(c);
        }


        System.out.println("hola");
	}
}
