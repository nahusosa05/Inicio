class Persona 
{
    String nombre;
    int edad;
    String direccion;

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

public class principal
{
	public static void main(String[] args)
	{
		Persona persona1 = new Persona("Nahuel","Av. Castañares 4273",20);
		persona1.saludar(persona1);

        String h = "hola";
        for(int i =0; i<h.length();i++)
        {
            char c = h.charAt(i);
            System.out.println(c);
        }
	}
    
}
