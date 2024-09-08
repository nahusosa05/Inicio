/* PARA DEBUGGEAR: 
Creo un breakpoint donde quiero debuggear, una vez puesto corro el programa y este se va a frenar
una vez el programa llegue a la linea de codigo donde esta ese breakpoint.*/

/* ATAJOS:
CTRL + / o CTRL + } == Comentar con //.
CTRL + S == Guardar.
CTRL + F5 == Compilar (sin debuggear).
F5 = Debuggear (acordarse del breakpoint).
ALT  ↑/↓  == Al principio de un codigo, mueve una linea.
Inicio == Te para al principio de la linea de codigo.
Fin == Te para al final de la linea de codigo.

- Snippets:
cmt == comentar.
clg == System.out.println();
 */

class Persona 
{
    // Creo los campos de Persona
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
		System.out.println("Hola mundo");
        //declaro persona1 como tipo de dato(clase) Persona
		Persona persona1 = new Persona("Nahuel","Calle falsa 123",20);
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