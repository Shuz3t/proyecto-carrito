import java.util.Scanner;

public class appCarrito 
{
    public static Scanner leer = new Scanner(System.in);

    private static listad<Integer> lista = new listad<Integer>();


    public static void main(String[] args) 
    {
        
        int opcion = 0;
        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1: //Agregar
               
               
                
                break;

                case 2: //Retirar
                
            

                break;

                case 3: //Mostrar siguiente
             

                break;

                case 4: //Mostrar cola
                
                break;

                case 5: //Acomodar cola
                
                break;

                case 0: //Terminar programa
                System.out.println("Terminar programa");

                default:
                System.out.println("Opcion no valida");

            }

        } while(opcion != 0);
        leer.close();
    }


    public static int menu()
    {
        
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Nuevo carrito\n");
        System.out.println("2.- Eliminar carrito\n");
        System.out.println("3.- Agregar al carrito\n");
        System.out.println("4.- Cambiar producto\n");
        System.out.println("5.- Quitar del carrito\n");
        System.out.println("6.- Total del carrito\n");
        System.out.println("7.- Total global\n");
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}