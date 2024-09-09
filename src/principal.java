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
sout == System.out.println(); - Atajo para imprimir cosas por consola
 */
 
public class principal
{
    public static void main(String[] args)
	/* CLASE MAIN (int main() en c++) - Lo que se haga acá se ejecuta */ 
	{
        System.out.println("Hola");  //La sintaxis en java es como esta en c++ es distinto (cout << "hola" << endl;) 

        // Tipos de datos y variables en Java.

        int i = 10; // Enteros
        double d = 4.54; // Double (va con . el decimal)
        Boolean b = true; // Booleanos (true/false)
        char c = 'A'; // Caracteres
        String s = "hola"; // Java es Case sensitive, es decir distingue mayusculas de minúsculas (String != string) }
        long l = 123456789;

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l);

        int num1,num2,resultado;
        num1 = 10;
        num2 = 20;

        // los condicionales if y else funcionan igual que en c++
        if(num2==0)
        {
            System.out.println("No existe division por 0");
        }
        else
        {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);  
            // Lo que hace el + es concatenar esa variable (en este caso un int) al string para poder mostrarlo en pantalla.
        }

        /* Realizar un programa que permita el intercambio de valores entre 2 variables con valor inicial. */
        int num_1 = 35;
        int num_2= 20;
        System.out.println("Numero 1: " + num_1 +" - Numero 2: " + num_2);
        int aux = num_1;
        num_1 = num_2;
        num_2 = aux;
        System.out.println("Numero 1: " + num_1 +" - Numero 2: " + num_2);

        /* Estructura switch */
        // Segun lo que se decida en la expresion logica, ocurre un case (caso) de todos los posibles que haya
        int dia = 1;
        String nombreDia;

        switch (dia) 
        {
            case 1: nombreDia ="Lunes";    // si dia == 1 ==> nombreDia="Lunes"
                break;                     // break sirve para cortar las condiciones.
            case 2: nombreDia ="Martes";
                break;
            case 3: nombreDia ="Miercoles";
                break;
            case 4: nombreDia ="Jueves";
                break;
            case 5: nombreDia ="Viernes";
                break;
            case 6: nombreDia ="Sabado";
                break;
            case 7: nombreDia ="Domingo";
                break;    
            default: nombreDia = "Número de día invalido";   // en caso de que no haya un case especificado como dia == 8
                break;
        }
        if(dia>0 && dia <8)
        {
            System.out.println("El dia de la semana seleccionado es: " + nombreDia);
        }
        else
        {
            System.out.println(nombreDia);
        }
        System.out.println("chau mundo");
        System.out.println("fernandito");
	}
}